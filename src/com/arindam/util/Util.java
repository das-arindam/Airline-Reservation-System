package com.arindam.util;

import com.arindam.model.Flight;
import com.arindam.model.Passenger;
import com.arindam.model.Reservation;
import com.arindam.model.Seat;
import com.arindam.service.Onboard;

public class Util {
    public void util(Flight flight, Seat seat, Passenger passenger) {

        // Create a new seat
        if (Onboard.isLegal(flight)) {
            // Create a new reservation
            Reservation reservation = new Reservation(flight, passenger, seat);
            // Add the reservation to the flight
            flight.addReservation(reservation);
            // Print the reservation
            reservation.print();
        } else {
            System.out.println("Reservation not possible!");
        }
        // Print the flight
        flight.print();
        // Print the passenger
        passenger.print();

    }
}

