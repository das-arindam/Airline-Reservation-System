package com.arindam.service;

import com.arindam.model.Flight;

import java.util.logging.Logger;

public class LegalReservation {
    static Logger logger = Logger.getLogger(LegalReservation.class.getName());

    public static boolean isLegal(Flight flight) {

        if (flight.getCapacity() - 1 >= 0)

            return true;

        return false;
    }

}
