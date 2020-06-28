package io.github.pakhomovalexander.service;

import static io.github.pakhomovalexander.builders.dsl.GenericBuilderDsl.address;
import static io.github.pakhomovalexander.builders.dsl.GenericBuilderDsl.given;
import static io.github.pakhomovalexander.builders.dsl.GenericBuilderDsl.organisation;
import static io.github.pakhomovalexander.builders.dsl.GenericBuilderDsl.person;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HostelImplTestWithSmartBuilder {
    Hostel service;

    @BeforeEach
    void setUp() {
        service = new HostelImpl("Best hostel");
    }

    @Test
    void shouldWelcomePerson() {
        // Given
        var person = given(
                person().firstName("Alexander")
                        .lastName("Pakhomov")
                        .address(address().country("Russia").city("Moscow"))
        );

        // When
        String welcomeMessage = service.getWelcome(person);

        // Then
        assertThat(welcomeMessage).isEqualTo("Welcome in Best hostel, Alexander Pakhomov. Russia is great!");
    }

    @Test
    void shouldWelcomePersonWithEmptyCountry() {
        // Given
        var person = given(
                person().firstName("Alexander")
                        .lastName("Pakhomov")
                        .address(address().country("").city("Moscow"))
        );

        // When
        String welcomeMessage = service.getWelcome(person);

        // Then
        assertThat(welcomeMessage).isEqualTo("Welcome in Best hostel, Alexander Pakhomov.");
    }

    @Test
    void shouldWelcomeOrganisation() {
        // Given
        var organisation = given(
                organisation()
                        .organisationName("Apple Inc")
                        .address(address().country("Russia").city("Moscow"))
        );

        // When
        String welcomeMessage = service.getWelcome(organisation);

        // Then
        assertThat(welcomeMessage).isEqualTo("Welcome in Best hostel, Apple Inc. Russia is great!");
    }
}