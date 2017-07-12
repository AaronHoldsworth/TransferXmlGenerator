/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asterixxmlcreator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

/**
 *
 * @author TTGAHX
 */
public class AsterixBlock {

    Random rand = new Random();
    String bookingId;
    String toCode;
    String sourceMarket;
    String transferType;
    String destination;
    String hotel;
    String hotelName;
    String transferDate;
    String transferServiceType;
    String flightCarrier;
    String flightNumber;
    String flightTime;
    String pickupTime;
    String pickupData;
    int busNumber = rand.nextInt(10) + 1;
    ArrayList<Passengers> passengers;

    AsterixBlock(
            String BookingId,
            int NumberPax,
            String EndDate,
            String SourceMarket,
            String Destination,
            int NumberOfChildren,
            String Ldi,
            String HotelName,
            String FlightNumber,
            String FlightCarrier,
            String FlightTime) {
        passengers = new ArrayList<>();
        
        if (SourceMarket.equals("BE") || SourceMarket.equals("JE"))bookingId = "JET" + BookingId;
        else bookingId = BookingId;
        
        if (SourceMarket.equals("BE") || SourceMarket.equals("JE")) toCode = "JET";
        else toCode = Destination;
        
        if (SourceMarket.equals("BE")) sourceMarket = "JE";
        else sourceMarket = SourceMarket;
        transferType = "D";
        destination = Destination;
        hotel = Ldi;
        hotelName = HotelName;
        transferDate = EndDate;
        transferServiceType = "I";
        flightCarrier = FlightCarrier;
        flightNumber = FlightNumber;
        flightTime = FlightTime;

        try {
            SimpleDateFormat df = new SimpleDateFormat("HHmm");
            Date d = df.parse(flightTime);
            Calendar gc = new GregorianCalendar();
            gc.setTime(d);
            gc.add(Calendar.HOUR, -3);
            Date d2 = gc.getTime();
            pickupTime = df.format(d2);
        } 
        
        catch (ParseException e) {

        }

        pickupData = "Bus " + Integer.toString(busNumber);

        for (int i = 1; i <= NumberPax; i++) {
            boolean isChild = false;
            if (i > NumberPax - NumberOfChildren) {
                isChild = true;
            }

            passengers.add(new Passengers(i, isChild));
        }

    }

    AsterixBlock() {

    }
}

class Passengers {

    String paxId;
    String firstName;
    String paxAge;
    String paxType;
    Random rand = new Random();

    Passengers(int SeqNumber, boolean isChild) {

        paxId = "00" + Integer.toString(SeqNumber);
        firstName = "FirstName";

        if (isChild) {
            paxType = "CHILD";
            paxAge = Integer.toString(rand.nextInt(17) + 1);
        } else {
            paxType = "ADULT";
            paxAge = Integer.toString(rand.nextInt(50) + 18);
        }

    }
}
