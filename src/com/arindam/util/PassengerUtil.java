package com.arindam.util;

import com.arindam.model.Passenger;

import java.util.Scanner;
import java.util.logging.Logger;

public class PassengerUtil {
    static Logger logger = Logger.getLogger(SeatUtil.class.getName());
    public static Passenger passengerUtil() {
        Scanner scanner = new Scanner(System.in);
        logger.info("Enter firstName: ");
        String firstName = scanner.nextLine();
        logger.info("Enter lastName: ");
        String lastName = scanner.nextLine();
        logger.info("Enter phoneNumber: ");
        String phoneNumber = scanner.nextLine();
        logger.info("Enter email: ");
        String email = scanner.nextLine();
        logger.info("Enter address: ");
        String address = scanner.nextLine();
        logger.info("Enter city: ");
        String city = scanner.nextLine();
        logger.info("Enter state: ");
        String state = scanner.nextLine();
        // Create a new passenger
        scanner.close();
        return new Passenger(firstName, lastName, phoneNumber, email, address, city, state);

    }
}
