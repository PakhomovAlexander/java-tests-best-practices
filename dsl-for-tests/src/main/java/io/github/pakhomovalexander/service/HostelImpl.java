package io.github.pakhomovalexander.service;

import io.github.pakhomovalexander.domain.AbstractCustomer;

public class HostelImpl implements Hostel {
    private String hostelName;

    public HostelImpl(String hostelName) {
        this.hostelName = hostelName;
    }

    @Override
    public String getWelcome(AbstractCustomer customer) {
        String rest = "".equals(customer.getCountry())
                ? ""
                : " " + customer.getCountry() + " is great!";

        return "Welcome in " + hostelName + ", " + customer.getWelcomeName() + "." + rest;
    }
}
