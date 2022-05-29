package com.arindam;

import com.arindam.model.Flight;
import com.arindam.model.Passenger;
import com.arindam.model.Seat;
import com.arindam.util.FlightUtil;
import com.arindam.util.PassengerUtil;
import com.arindam.util.SeatUtil;
import com.arindam.util.Util;

import java.util.Scanner;
import java.util.logging.Logger;

public class AirlineReservationSystem {
    static Logger logger = Logger.getLogger(SeatUtil.class.getName());
    public static void main(String[] args) {
        Flight flight = FlightUtil.flightUtil();
        Seat seat = SeatUtil.seatUtil();
        Passenger passenger = PassengerUtil.passengerUtil();


        Util utl = new Util();
        utl.util(flight, seat, passenger);


    }
}
