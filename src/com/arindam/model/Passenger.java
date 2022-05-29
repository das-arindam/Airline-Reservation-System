package com.arindam.model;

import com.arindam.util.SeatUtil;

import java.util.logging.Logger;

public class Passenger {
    static Logger logger = Logger.getLogger(SeatUtil.class.getName());
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String address;
    private String city;
    private String state;

    public Passenger(String firstName, String lastName, String phoneNumber, String email, String address, String city, String state) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.city = city;
        this.state = state;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public void print() {
        logger.info("Passenger: " + firstName + " " + lastName);
        logger.info("Phone: " + phoneNumber);
        logger.info("Email: " + email);
        logger.info("Address: " + address);
        logger.info("City: " + city);
        logger.info("State: " + state);
    }

}