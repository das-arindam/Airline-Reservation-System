package com.arindam.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class Flight {
    static Logger logger = Logger.getLogger(Flight.class.getName());
    private final String origin;
    private final String destination;
    private final String departureTime;
    private final String arrivalTime;
    private final int capacity;
    private final HashMap<String, ArrayList<Seat>> reservations;

    public Flight(String origin, String destination, String departureTime, String arrivalTime, int capacity) {
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.capacity = capacity;
        this.reservations = new HashMap<>();
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public int getCapacity() {
        return capacity;
    }

    public void addReservation(Reservation reservation) {
        String rowNumber = reservation.getSeat().getRowNumber();
        if (!reservations.containsKey(rowNumber)) {
            ArrayList<Seat> seats = new ArrayList<>();
            seats.add(reservation.getSeat());
            reservations.put(rowNumber, seats);
        } else {
            ArrayList<Seat> seats = reservations.get(rowNumber);
            seats.add(reservation.getSeat());
            reservations.put(rowNumber, seats);
        }
    }

    public void print() {
        String flightLog = "Flight: " + origin + " to " + destination + " at " + departureTime + " on " + arrivalTime;
        logger.info(flightLog);
        String capacityLog = "Capacity: " + capacity;
        logger.info(capacityLog);
        String reservationLog = "Reservations:";
        logger.info(reservationLog);
        for (Map.Entry<String, ArrayList<Seat>> entry : reservations.entrySet()) {
            ArrayList<Seat> seats = entry.getValue();
            for (Seat seat : seats) {
                seat.print();
            }
        }
    }

    public List<Seat> getSeats() {
        List<Seat> seats = new ArrayList<>();
        for (String rowNumber : reservations.keySet()) {
            ArrayList<Seat> rowSeats = reservations.get(rowNumber);
            for (Seat seat : rowSeats) {
                seats.add(seat);
            }
        }
        return seats;
    }

}