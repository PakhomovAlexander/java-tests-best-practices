package io.github.pakhomovalexander.domain;

import java.util.Objects;

public abstract class AbstractCustomer {
    private Address address;

    public abstract String getWelcomeName();

    public String getCountry() {
        return address.getCountry();
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractCustomer that = (AbstractCustomer) o;
        return Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address);
    }

    @Override
    public String toString() {
        return "AbstractCustomer{" +
                "address=" + address +
                '}';
    }
}
