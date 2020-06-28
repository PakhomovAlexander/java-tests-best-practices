package io.github.pakhomovalexander.builders;

import io.github.pakhomovalexander.domain.Address;

public class AddressBuilder<T extends Address> implements GenericBuilder<T, AddressBuilder<T>> {
    private String street;
    private String city;
    private String country;
    private int house;
    private int index;

    public AddressBuilder<T> street(String street) {
        this.street = street;
        return this;
    }

    public AddressBuilder<T> city(String city) {
        this.city = city;
        return this;
    }

    public AddressBuilder<T> country(String country) {
        this.country = country;
        return this;
    }

    public AddressBuilder<T> house(int house) {
        this.house = house;
        return this;
    }

    public AddressBuilder<T> index(int index) {
        this.index = index;
        return this;
    }

    @Override
    public T build() {
        var address = new Address();
        address.setCountry(this.country);
        address.setCity(this.city);
        address.setStreet(this.street);
        address.setHouse(this.house);
        address.setIndex(this.index);

        return (T) address;
    }
}
