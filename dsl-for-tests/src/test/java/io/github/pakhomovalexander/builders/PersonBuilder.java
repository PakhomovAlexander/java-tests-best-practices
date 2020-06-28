package io.github.pakhomovalexander.builders;

import io.github.pakhomovalexander.domain.Person;

public class PersonBuilder<T extends Person> extends CustomerBuilder<T, PersonBuilder<T>> {
    private String firstName;
    private String lastName;

    public PersonBuilder<T> firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder<T> lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public T build() {
        T person = (T) new Person();
        super.setCustomerFields(person);
        person.setFirstName(this.firstName);
        person.setLastName(this.lastName);

        return person;
    }
}
