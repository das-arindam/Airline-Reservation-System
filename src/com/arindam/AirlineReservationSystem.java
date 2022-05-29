package com.arindam;

import com.arindam.model.Flight;
import com.arindam.model.Passenger;
import com.arindam.model.Seat;
import com.arindam.service.ReservationService;
import com.arindam.util.FlightUtil;
import com.arindam.util.PassengerUtil;
import com.arindam.util.SeatUtil;

public class AirlineReservationSystem {

    public static void main(String[] args) {
        Flight flight = FlightUtil.flightUtil();
        Seat seat = SeatUtil.seatUtil();
        Passenger passenger = PassengerUtil.passengerUtil();
        ReservationService.util(flight, seat, passenger);
    }
}
