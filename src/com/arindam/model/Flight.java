package com.arindam.model;

import java.util.ArrayList;
import java.util.HashMap;

public class Flight {
    private String origin;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private int capacity;
    private HashMap<String, ArrayList<Seat>> reservations;

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
        String seatNumber = reservation.getSeat().getColumnNumber();
        String rowNumber = reservation.getSeat().getRowNumber();
        if (!reservations.containsKey(rowNumber)) {
            ArrayList<Seat> seats = new ArrayList<Seat>();
            seats.add(reservation.getSeat());
            reservations.put(rowNumber, seats);
        } else {
            ArrayList<Seat> seats = reservations.get(rowNumber);
            seats.add(reservation.getSeat());
            reservations.put(rowNumber, seats);
        }
    }

    public void print() {
        System.out.println("Flight: " + origin + " to " + destination + " at " + departureTime + " on " + arrivalTime);
        System.out.println("Capacity: " + capacity);
        System.out.println("Reservations:");
        for (String rowNumber : reservations.keySet()) {
            ArrayList<Seat> seats = reservations.get(rowNumber);
            for (Seat seat : seats) {
                seat.print();
            }
        }
    }

    public ArrayList<Seat> getSeats() {
        ArrayList<Seat> seats = new ArrayList<Seat>();
        for (String rowNumber : reservations.keySet()) {
            ArrayList<Seat> rowSeats = reservations.get(rowNumber);
            for (Seat seat : rowSeats) {
                seats.add(seat);
            }
        }
        return seats;
    }

}