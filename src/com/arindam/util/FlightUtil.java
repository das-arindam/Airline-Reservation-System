package com.arindam.util;

import com.arindam.model.Flight;

import java.util.Scanner;
import java.util.logging.Logger;

public class FlightUtil {
    static Logger logger = Logger.getLogger(FlightUtil.class.getName());

    public static Flight flightUtil() {
        Scanner scanner = new Scanner(System.in);
        logger.info("Enter flight origin");
        String flightOrigin = scanner.nextLine();
        logger.info("Enter flight destination");
        String flightDestination = scanner.nextLine();
        logger.info("Enter departure time");
        String flightDepartureTime = scanner.nextLine();
        logger.info("Enter arrival time");
        String flightArrivalTime = scanner.nextLine();
        logger.info("Enter flight capacity");
        String space = scanner.nextLine();
        int flightCapacity = Integer.parseInt(space);
        return new Flight(flightOrigin, flightDestination, flightDepartureTime, flightArrivalTime, flightCapacity);
    }
}
