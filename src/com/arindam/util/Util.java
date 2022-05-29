package com.arindam.util;

import com.arindam.model.Flight;
import com.arindam.model.Passenger;
import com.arindam.model.Reservation;
import com.arindam.model.Seat;
import com.arindam.service.Onboard;

import java.util.logging.Logger;

public class Util {
    static Logger logger = Logger.getLogger(SeatUtil.class.getName());

    public static void util(Flight flight, Seat seat, Passenger passenger) {
        if (Onboard.isLegal(flight)) {
            Reservation reservation = new Reservation(flight, passenger, seat);
            flight.addReservation(reservation);
            reservation.print();
            flight.print();
            passenger.print();
        } else {
            logger.info("Reservation not possible!");
        }
    }
}

