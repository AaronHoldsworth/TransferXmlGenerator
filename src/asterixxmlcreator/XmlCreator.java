/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asterixxmlcreator;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author TTGAHX
 */
public class XmlCreator {

    static String _fileName;
    static String _creationDate;
    static String _creationTime;
    static Element bookings;
    static Document doc;
    static String directoryName;
    static JProgressBar _prog;

    static void CreateXml(ArrayList<AsterixBlock> asterixList, String SourceMarket, String FileName, JButton button, JProgressBar prog) {

        SimpleDateFormat fileNameDate = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat creationDateFormat = new SimpleDateFormat("ddMMyyyy");
        SimpleDateFormat creationTimeFormat = new SimpleDateFormat("HHmm");

        _fileName = SourceMarket + fileNameDate.format(new Date()) + "-001.xml";
        _creationDate = creationDateFormat.format(new Date());
        _creationTime = creationTimeFormat.format(new Date());

        directoryName = FileName;

        _prog = prog;
        _prog.setMinimum(0);
        _prog.setMaximum(asterixList.size());
        
        _prog.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent evt) {
                JProgressBar comp = (JProgressBar) evt.getSource();
                int value = comp.getValue();
                int min = comp.getMinimum();
                int max = comp.getMaximum();
            }
        });

        StartXml();
        CreateAsterixBlock(asterixList);
        CreateXmlFile();
        JOptionPane.showMessageDialog(null, "Done", "Done", JOptionPane.INFORMATION_MESSAGE);
        button.setEnabled(true);

    }

    private static void StartXml() {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("pickups");
            doc.appendChild(rootElement);

            Element header = doc.createElement("header");
            rootElement.appendChild(header);

            Element fileName = doc.createElement("fileName");
            fileName.appendChild(doc.createTextNode(_fileName));
            header.appendChild(fileName);

            Element creationDate = doc.createElement("creationDate");
            creationDate.appendChild(doc.createTextNode(_creationDate));
            header.appendChild(creationDate);

            Element creationTime = doc.createElement("creationTime");
            creationTime.appendChild(doc.createTextNode(_creationTime));
            header.appendChild(creationTime);

            bookings = doc.createElement("bookings");
            rootElement.appendChild(bookings);

        } catch (ParserConfigurationException | DOMException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Exception Thrown", JOptionPane.ERROR_MESSAGE);
        }

    }

    private static void CreateAsterixBlock(ArrayList<AsterixBlock> asterixList) {

        int count = 0;
        for (AsterixBlock _item : asterixList) {

            Element booking = doc.createElement("booking");
            bookings.appendChild(booking);

            Element bookingId = doc.createElement("bookingId");
            bookingId.appendChild(doc.createTextNode(_item.bookingId));
            booking.appendChild(bookingId);

            Element tocode = doc.createElement("tocode");
            tocode.appendChild(doc.createTextNode(_item.toCode));
            booking.appendChild(tocode);

            Element sourceMarketGroup = doc.createElement("sourceMarketGroup");
            sourceMarketGroup.appendChild(doc.createTextNode(_item.sourceMarket));
            booking.appendChild(sourceMarketGroup);

            Element transferType = doc.createElement("transferType");
            transferType.appendChild(doc.createTextNode(_item.transferType));
            booking.appendChild(transferType);

            Element airportInDestination = doc.createElement("airportInDestination");
            airportInDestination.appendChild(doc.createTextNode(_item.destination));
            booking.appendChild(airportInDestination);

            Element hotel = doc.createElement("hotel");
            hotel.appendChild(doc.createTextNode(_item.hotel));
            booking.appendChild(hotel);

            Element hotelTransfer = doc.createElement("hotelTransfer");
            hotelTransfer.appendChild(doc.createTextNode(_item.hotelName));
            booking.appendChild(hotelTransfer);

            Element transferDate = doc.createElement("transferDate");
            transferDate.appendChild(doc.createTextNode(_item.transferDate));
            booking.appendChild(transferDate);

            Element transferServiceType = doc.createElement("transferServiceType");
            transferServiceType.appendChild(doc.createTextNode(_item.transferServiceType));
            booking.appendChild(transferServiceType);

            Element flightCarrier = doc.createElement("flightCarrier");
            flightCarrier.appendChild(doc.createTextNode(_item.flightCarrier));
            booking.appendChild(flightCarrier);

            Element flightNumber = doc.createElement("flightNumber");
            flightNumber.appendChild(doc.createTextNode(_item.flightNumber));
            booking.appendChild(flightNumber);

            Element flightDate = doc.createElement("flightDate");
            flightDate.appendChild(doc.createTextNode(_item.transferDate));
            booking.appendChild(flightDate);

            Element flightTime = doc.createElement("flightTime");
            flightTime.appendChild(doc.createTextNode(_item.flightTime));
            booking.appendChild(flightTime);

            Element pickupTime = doc.createElement("pickupTime");
            pickupTime.appendChild(doc.createTextNode(_item.pickupTime));
            booking.appendChild(pickupTime);

            Element pickupData = doc.createElement("pickupData");
            pickupData.appendChild(doc.createTextNode(_item.pickupData));
            booking.appendChild(pickupData);

            Element paxes = doc.createElement("paxes");
            booking.appendChild(paxes);

            _item.passengers.forEach((_passenger) -> {
                Element pax = doc.createElement("pax");
                paxes.appendChild(pax);

                Element paxId = doc.createElement("paxId");
                paxId.appendChild(doc.createTextNode(_passenger.paxId));
                pax.appendChild(paxId);

                Element paxType = doc.createElement("paxType");
                paxType.appendChild(doc.createTextNode(_passenger.paxType));
                pax.appendChild(paxType);

                Element paxFirstName = doc.createElement("paxFirstName");
                paxFirstName.appendChild(doc.createTextNode(_passenger.firstName));
                pax.appendChild(paxFirstName);

                Element paxAge = doc.createElement("paxAge");
                paxAge.appendChild(doc.createTextNode(_passenger.paxAge));
                pax.appendChild(paxAge);
            });
            count++;
            _prog.setValue(count);

        };

    }

    private static void CreateXmlFile() {

        try {

            File directory = new File(directoryName);
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            if (!directory.exists()) {
                directory.mkdir();
            }

            StreamResult result = new StreamResult(new File(directoryName + _fileName));

            transformer.transform(source, result);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Exception Thrown", JOptionPane.ERROR_MESSAGE);
        }
    }

}
