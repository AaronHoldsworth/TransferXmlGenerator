/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asterixxmlcreator;

import java.util.ArrayList;
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
            int FlightTime) {
        passengers = new ArrayList<>();
        bookingId = BookingId;
        toCode = Destination;
        sourceMarket = SourceMarket;
        transferType = "D";
        destination = Destination;
        hotel = Ldi;
        hotelName = HotelName;
        transferDate = EndDate;
        transferServiceType = "I";
        flightCarrier = FlightCarrier;
        flightNumber = FlightNumber;
        flightTime = Integer.toString(FlightTime);
        pickupTime = Integer.toString(FlightTime - 300);
        pickupData = "Bus " + Integer.toString(busNumber);

        for (int i = 1; i <= NumberPax; i++) {
            boolean isChild = false;
            if (i > NumberPax - NumberOfChildren) {
                isChild = true;
            }

            passengers.add(new Passengers(i, isChild));
        }

    }
    
    AsterixBlock()
    {
        
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
