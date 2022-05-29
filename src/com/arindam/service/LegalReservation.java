package com.arindam.service;

import com.arindam.model.Flight;

import java.util.logging.Logger;

public class LegalReservation {
    static Logger logger = Logger.getLogger(LegalReservation.class.getName());

    public static boolean isLegal(Flight flight) {

        return flight.getCapacity() - 1 >= 0;
    }

}
