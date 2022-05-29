package com.arindam.model;

import java.util.logging.Logger;

public class Seat {
    static Logger logger = Logger.getLogger(Seat.class.getName());
    private final String columnNumber;
    private final String rowNumber;

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
        String print = "Seat: " + columnNumber + " in row " + rowNumber;
        logger.info(print);
    }
}
