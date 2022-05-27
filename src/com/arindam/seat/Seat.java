package com.arindam.seat;

public class Seat {
    private String seatNumber;
    private String rowNumber;
    public Seat(String seatNumber, String rowNumber) {
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public String getRowNumber() {
        return rowNumber;
    }

    public void print() {
        System.out.println("com.arindam.seat.Seat: " + seatNumber + " in row " + rowNumber);
    }
}
