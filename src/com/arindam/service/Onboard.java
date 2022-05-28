package com.arindam.service;

import com.arindam.model.Flight;

public class Onboard {

    public static boolean isLegal(Flight flight) {

        if (flight.getCapacity() - 1 >= 0)

            return true;

        return false;
    }

}
