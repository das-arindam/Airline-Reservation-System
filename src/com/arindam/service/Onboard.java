package com.arindam.service;

import com.arindam.model.Flight;

import java.util.logging.Logger;

public class Onboard {
    static Logger logger = Logger.getLogger(Onboard.class.getName());

    public static boolean isLegal(Flight flight) {

        if (flight.getCapacity() - 1 >= 0)

            return true;

        return false;
    }

}
