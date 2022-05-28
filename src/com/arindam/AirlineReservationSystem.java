package com.arindam;

import com.arindam.model.Flight;
import com.arindam.model.Passenger;
import com.arindam.util.Util;

import java.util.Scanner;

public class AirlineReservationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter flight origin");
        String flightOrigin = scanner.nextLine();
        System.out.println("Enter flight destination");
        String flightDestination = scanner.nextLine();
        System.out.println("Enter departure time");
        String flightDepartureTime = scanner.nextLine();
        System.out.println("Enter arrival time");
        String flightArrivalTime = scanner.nextLine();
        System.out.println("Enter flight capacity");
        int flightCapacity = Integer.parseInt(scanner.nextLine());


        Flight flight = new Flight(flightOrigin,flightDestination,flightDepartureTime,flightArrivalTime,flightCapacity);
        Util utl = new Util();
        utl.util(flight);



    }
}
