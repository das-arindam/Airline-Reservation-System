package com.arindam.model;

import com.arindam.util.SeatUtil;

import java.util.logging.Logger;

public class Seat {
    static Logger logger = Logger.getLogger(SeatUtil.class.getName());
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
        String print = "Seat: " + columnNumber + " in row " + rowNumber;
        logger.info(print);
    }
}
