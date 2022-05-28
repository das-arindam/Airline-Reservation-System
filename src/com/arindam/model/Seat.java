package com.arindam.model;

public class Seat {
    private String columnNumber;
    private String rowNumber;

    public Seat(String columnNumber, String rowNumber) {
        this.columnNumber = columnNumber;
        this.rowNumber = rowNumber;
    }

    public String getColumnNumber() {
        return columnNumber;
    }

    public String getRowNumber() {
        return rowNumber;
    }

    public void print() {
        System.out.println("Seat: " + columnNumber + " in row " + rowNumber);
    }
}
