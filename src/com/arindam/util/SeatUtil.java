package com.arindam.util;

import com.arindam.model.Seat;

import java.util.Scanner;

public class SeatUtil {
    public static Seat seatUtil() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter column number");
        String columnNumber = scanner.nextLine();
        System.out.println("Enter row number");
        String rowNumber = scanner.nextLine();
        Seat seat = new Seat(columnNumber, rowNumber);
        scanner.close();
        return seat;
    }
}

