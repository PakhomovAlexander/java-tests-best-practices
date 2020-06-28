package io.github.pakhomovalexander.service;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.pakhomovalexander.domain.Address;
import io.github.pakhomovalexander.domain.Organisation;
import io.github.pakhomovalexander.domain.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HostelImplTestWithoutSmartBuilder {
    Hostel service;

    @BeforeEach
    void setUp() {
        service = new HostelImpl("Best hostel");
    }

    @Test
    void shouldWelcomePerson() {
        // Given
        Address address = new Address();
        address.setCountry("Russia");
        address.setCity("Moscow");
        // And
        Person person = new Person();
        person.setFirstName("Alexander");
        person.setLastName("Pakhomov");
        person.setAddress(address);

        // When
        String welcomeMessage = service.getWelcome(person);

        // Then
        assertThat(welcomeMessage).isEqualTo("Welcome in Best hostel, Alexander Pakhomov. Russia is great!");
    }

    @Test
    void shouldWelcomePersonWithEmptyCountry() {
        // Given
        Address address = new Address();
        address.setCountry("");
        address.setCity("Moscow");
        // And
        Person person = new Person();
        person.setFirstName("Alexander");
        person.setLastName("Pakhomov");
        person.setAddress(address);

        // When
        String welcomeMessage = service.getWelcome(person);

        // Then
        assertThat(welcomeMessage).isEqualTo("Welcome in Best hostel, Alexander Pakhomov.");
    }

    @Test
    void shouldWelcomeOrganisation() {
        // Given
        Address address = new Address();
        address.setCountry("Russia");
        address.setCity("Moscow");
        // And
        Organisation organisation = new Organisation();
        organisation.setOrganisationName("Apple Inc");
        organisation.setAddress(address);

        // When
        String welcomeMessage = service.getWelcome(organisation);

        // Then
        assertThat(welcomeMessage).isEqualTo("Welcome in Best hostel, Apple Inc. Russia is great!");
    }
}