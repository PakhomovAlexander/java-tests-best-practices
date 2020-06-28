package io.github.pakhomovalexander.builders;

import io.github.pakhomovalexander.domain.AbstractCustomer;
import io.github.pakhomovalexander.domain.Address;

public abstract class CustomerBuilder<T extends AbstractCustomer, B extends CustomerBuilder<T, B>>
        implements GenericBuilder<T,B> {

    private Address address;

    public GenericBuilder<T,B> address(Address address) {
        this.address = address;
        return this;
    }

    public GenericBuilder<T,B> address(AddressBuilder<Address> addressBuilder) {
        this.address = addressBuilder.build();
        return this;
    }

    protected abstract T createCustomer();

    @Override
    public T build() {
        T customer = createCustomer();
        customer.setAddress(address);

        return customer;
    }
}
