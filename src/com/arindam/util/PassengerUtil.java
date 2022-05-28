package com.arindam.util;

import com.arindam.model.Passenger;

import java.util.Scanner;

public class PassengerUtil {
    public static Passenger passengerUtil() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter firstName: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter lastName: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter phoneNumber: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter email: ");
        String email = scanner.nextLine();
        System.out.println("Enter address: ");
        String address = scanner.nextLine();
        System.out.println("Enter city: ");
        String city = scanner.nextLine();
        System.out.println("Enter state: ");
        String state = scanner.nextLine();
        // Create a new passenger
        scanner.close();
        return new Passenger(firstName, lastName, phoneNumber, email, address, city, state);

    }
}
