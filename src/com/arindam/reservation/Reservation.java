package com.arindam.reservation;

import com.arindam.flight.Flight;
import com.arindam.passenger.Passenger;
import com.arindam.seat.Seat;

public class Reservation {
    private Flight flight;
    private Passenger passenger;
    private Seat seat;

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
        System.out.println("Reservation: " + passenger.getFirstName() + " " + passenger.getLastName());
        System.out.println("Flight: " + flight.getOrigin() + " to " + flight.getDestination() + " at " + flight.getDepartureTime() + " on " + flight.getArrivalTime());
        System.out.println("Seat: " + seat.getSeatNumber() + " in row " + seat.getRowNumber());
    }

}