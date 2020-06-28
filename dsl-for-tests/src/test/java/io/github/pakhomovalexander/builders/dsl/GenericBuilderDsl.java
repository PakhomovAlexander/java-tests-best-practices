package io.github.pakhomovalexander.builders.dsl;

import io.github.pakhomovalexander.builders.AddressBuilder;
import io.github.pakhomovalexander.builders.GenericBuilder;
import io.github.pakhomovalexander.builders.OrganisationBuilder;
import io.github.pakhomovalexander.builders.PersonBuilder;
import io.github.pakhomovalexander.domain.Address;
import io.github.pakhomovalexander.domain.Organisation;
import io.github.pakhomovalexander.domain.Person;

public class GenericBuilderDsl {
    public static <T, B extends GenericBuilder<T, B>> T given(GenericBuilder<T, B> builder) {
        return builder.build();
    }

    public static PersonBuilder<Person> person() {
        return new PersonBuilder<>();
    }

    public static OrganisationBuilder<Organisation> organisation() {
        return new OrganisationBuilder<>();
    }

    public static AddressBuilder<Address> address() {
        return new AddressBuilder<>();
    }
}
