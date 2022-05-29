package com.arindam.util;

import com.arindam.model.Seat;

import java.util.Scanner;
import java.util.logging.Logger;

public class SeatUtil {
    static Logger logger = Logger.getLogger(SeatUtil.class.getName());

    public static Seat seatUtil() {
        Scanner scanner = new Scanner(System.in);
        logger.info("Enter column number");
        String columnNumber = scanner.nextLine();
        logger.info("Enter row number");
        String rowNumber = scanner.nextLine();
        scanner.close();
        return new Seat(columnNumber, rowNumber);
    }
}

