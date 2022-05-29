package com.arindam.model;

import java.util.logging.Logger;

public class Reservation {
    static Logger logger = Logger.getLogger(Reservation.class.getName());
    private final Flight flight;
    private final Passenger passenger;
    private final Seat seat;

    public Reservation(Flight flight, Passenger passenger, Seat seat) {
        this.flight = flight;
        this.passenger = passenger;
        this.seat = seat;
    }

    public Flight getFlight() {
        return flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Seat getSeat() {
        return seat;
    }

    public void print() {
        String reservationLog = "Reservation: " + passenger.getFirstName() + " " + passenger.getLastName();
        logger.info(reservationLog);
        String flightLog = "Flight: " + flight.getOrigin() + " to " + flight.getDestination() + " at " + flight.getDepartureTime() + " on " + flight.getArrivalTime();
        logger.info(flightLog);
        String seatLog = "Seat: " + seat.getColumnNumber() + " in row " + seat.getRowNumber();
        logger.info(seatLog);
    }

}