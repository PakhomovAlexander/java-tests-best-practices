package io.github.pakhomovalexander.domain;

import java.util.Objects;

public abstract class AbstractCustomer {
    private String street;
    private int index;
    private String city;
    private String country;

    public abstract String getWelcomeName();

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractCustomer abstractCustomer = (AbstractCustomer) o;
        return index == abstractCustomer.index &&
                Objects.equals(street, abstractCustomer.street) &&
                Objects.equals(city, abstractCustomer.city) &&
                Objects.equals(country, abstractCustomer.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, index, city, country);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "street='" + street + '\'' +
                ", index=" + index +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
