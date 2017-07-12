/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asterixxmlcreator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author TTGAHX
 */
public class AsterixDetailsWindow extends javax.swing.JFrame {

    /**
     * Creates new form AsterixDetailsWindow
     */
    public AsterixDetailsWindow() {

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtBookingIdStart = new javax.swing.JTextField();
        txtNumBookings = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNumPax = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSourceMarket = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDest = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        datepickEnd = new com.github.lgooddatepicker.components.DatePicker();
        jLabel8 = new javax.swing.JLabel();
        txtNumChildren = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtHotelLdi = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtHotelName = new javax.swing.JTextField();
        progDataCreation = new javax.swing.JProgressBar();
        jLabel10 = new javax.swing.JLabel();
        progFileCreation = new javax.swing.JProgressBar();
        jLabel11 = new javax.swing.JLabel();
        lblFlightCarrier = new javax.swing.JLabel();
        txtFlightCarrier = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtFlightNumber = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btnSaveLocation = new javax.swing.JButton();
        lblDirectory = new javax.swing.JLabel();
        txtFlightTime = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Transfer File Generator");

        jLabel1.setText("Booking Start Number");

        jLabel2.setText("Number of Bookings");
        jLabel2.setToolTipText("");

        jLabel4.setText("Total Pax");

        jLabel5.setText("End Date");

        jLabel6.setText("Source Market");

        jLabel7.setText("Destination  3LC");

        jLabel8.setText("Number of Children");

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jLabel3.setText("Hotel LDI");

        jLabel9.setText("Hotel Name");

        jLabel10.setText("Data Creation");

        jLabel11.setText("File Creation");

        lblFlightCarrier.setText("Flight Carrier");

        jLabel13.setText("Flight Number");

        jLabel14.setText("Flight Time");

        btnSaveLocation.setText("Save Files To...");
        btnSaveLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveLocationActionPerformed(evt);
            }
        });

        lblDirectory.setText("C:\\AsterixFiles\\");

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(btnSaveLocation)
                            .addGap(18, 18, 18)
                            .addComponent(lblDirectory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(95, 95, 95)
                            .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel10)
                            .addGap(18, 18, 18)
                            .addComponent(progDataCreation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel11)
                            .addGap(25, 25, 25)
                            .addComponent(progFileCreation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblFlightCarrier, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel6)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel5))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel2))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel1)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(datepickEnd, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                .addComponent(txtNumBookings)
                                .addComponent(txtSourceMarket, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtDest)
                                .addComponent(txtHotelLdi)
                                .addComponent(txtHotelName)
                                .addComponent(txtFlightNumber)
                                .addComponent(txtFlightTime)
                                .addComponent(txtNumChildren)
                                .addComponent(txtNumPax)
                                .addComponent(txtFlightCarrier, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtBookingIdStart))))
                    .addContainerGap(40, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnSaveLocation)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(lblDirectory)))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtBookingIdStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(6, 6, 6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNumBookings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGap(11, 11, 11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(txtSourceMarket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(6, 6, 6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel7))
                        .addComponent(txtDest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(11, 11, 11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel3))
                        .addComponent(txtHotelLdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(11, 11, 11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel9))
                        .addComponent(txtHotelName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(11, 11, 11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(lblFlightCarrier))
                        .addComponent(txtFlightCarrier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(11, 11, 11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel13))
                        .addComponent(txtFlightNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(11, 11, 11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel14))
                        .addComponent(txtFlightTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(11, 11, 11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel4))
                        .addComponent(txtNumPax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(11, 11, 11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel8))
                        .addComponent(txtNumChildren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(11, 11, 11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(jLabel5))
                        .addComponent(datepickEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(jLabel10))
                        .addComponent(progDataCreation, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(jLabel11))
                        .addComponent(progFileCreation, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(26, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        boolean result = isNullOrEmpty(txtBookingIdStart.getText(),
                txtNumBookings.getText(),
                txtSourceMarket.getText(),
                txtDest.getText(),
                txtHotelLdi.getText(),
                txtHotelName.getText(),
                txtFlightCarrier.getText(),
                txtFlightNumber.getText(),
                txtFlightTime.getText(),
                txtNumPax.getText(),
                txtNumChildren.getText(),
                datepickEnd.getText());
        if (result) {
            JOptionPane.showMessageDialog(null, "Please fill in all fields", "Missing Fields", JOptionPane.INFORMATION_MESSAGE);
        }

        if (Integer.parseInt(txtNumBookings.getText()) > 200000) {
            JOptionPane.showMessageDialog(null, "Please use a value less than 200,000", "Too Many Bookings", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Runnable r = () -> {
                try {
                    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("ddMMyyyy");
                    SimpleDateFormat timeFormat = new SimpleDateFormat("HHmm");

                    String endDate = datepickEnd.getDate().format(dateFormat);
                    
                    Date flightTimeFomat = timeFormat.parse(txtFlightTime.getText());
                    
                    String flightTime = timeFormat.format(flightTimeFomat);

                    btnCreate.setEnabled(false);

                    int bookingStart = Integer.parseInt(txtBookingIdStart.getText());
                    int bookingEnd = bookingStart + Integer.parseInt(txtNumBookings.getText());
                    progDataCreation.setMinimum(bookingStart);
                    progDataCreation.setMaximum(bookingEnd);
                    ArrayList<AsterixBlock> asterixList = new ArrayList<>();
                    int count = bookingStart;
                    for (int i = bookingStart; i < bookingEnd; i++) {
                        AsterixBlock ab = new AsterixBlock(
                                Integer.toString(i),
                                Integer.parseInt(txtNumPax.getText()),
                                endDate,
                                txtSourceMarket.getText(),
                                txtDest.getText(),
                                Integer.parseInt(txtNumChildren.getText()),
                                txtHotelLdi.getText(),
                                txtHotelName.getText(),
                                txtFlightNumber.getText(),
                                txtFlightCarrier.getText(),
                                flightTime);
                        asterixList.add(ab);
                        count++;
                        progDataCreation.setValue(count);
                    }

                    XmlCreator.CreateXml(asterixList, txtSourceMarket.getText(), lblDirectory.getText(), btnCreate, progFileCreation);
                } catch (NumberFormatException | ParseException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Exception Thrown", JOptionPane.ERROR_MESSAGE);
                }
            };

            new Thread(r).start();
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnSaveLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveLocationActionPerformed
        JFileChooser directoryBrowser = new JFileChooser();
        directoryBrowser.setCurrentDirectory(new java.io.File(lblDirectory.getText()));
        directoryBrowser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        //
        // disable the "All files" option.
        //
        directoryBrowser.setAcceptAllFileFilterUsed(false);
        //    
        if (directoryBrowser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            lblDirectory.setText(directoryBrowser.getCurrentDirectory().toString());
        }
    }//GEN-LAST:event_btnSaveLocationActionPerformed

/**
 * @param args the command line arguments
 */
public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                

}
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AsterixDetailsWindow.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AsterixDetailsWindow.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AsterixDetailsWindow.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AsterixDetailsWindow.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AsterixDetailsWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnSaveLocation;
    private com.github.lgooddatepicker.components.DatePicker datepickEnd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblDirectory;
    private javax.swing.JLabel lblFlightCarrier;
    private javax.swing.JProgressBar progDataCreation;
    private javax.swing.JProgressBar progFileCreation;
    private javax.swing.JTextField txtBookingIdStart;
    private javax.swing.JTextField txtDest;
    private javax.swing.JTextField txtFlightCarrier;
    private javax.swing.JTextField txtFlightNumber;
    private javax.swing.JTextField txtFlightTime;
    private javax.swing.JTextField txtHotelLdi;
    private javax.swing.JTextField txtHotelName;
    private javax.swing.JTextField txtNumBookings;
    private javax.swing.JTextField txtNumChildren;
    private javax.swing.JTextField txtNumPax;
    private javax.swing.JTextField txtSourceMarket;
    // End of variables declaration//GEN-END:variables

    public static boolean isNullOrEmpty(String... strArr) {
        for (String st : strArr) {
            if (st == null || st.equals("")) {
                return true;
            }

        }
        return false;
    }
}
