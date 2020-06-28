package io.github.pakhomovalexander.builders;

import io.github.pakhomovalexander.domain.AbstractCustomer;
import io.github.pakhomovalexander.domain.Address;

public abstract class CustomerBuilder<T extends AbstractCustomer, B extends CustomerBuilder<T, B>> implements GenericBuilder<T,B> {
    Address address;

    public GenericBuilder<T,B> address(Address address) {
        this.address = address;
        return (B) this;
    }

    public GenericBuilder<T,B> address(AddressBuilder addressBuilder) {
        this.address = addressBuilder.build();
        return (B) this;
    }

    protected void setCustomerFields(T customer) {
        customer.setAddress(this.address);
    }
}
