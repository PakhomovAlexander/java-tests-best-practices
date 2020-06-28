package io.github.pakhomovalexander.builders;

import io.github.pakhomovalexander.domain.Organisation;

public class OrganisationBuilder<T extends Organisation> extends CustomerBuilder<T, OrganisationBuilder<T>> {
    private String organisationName;

    public OrganisationBuilder<T> organisationName(String organisationName) {
        this.organisationName = organisationName;
        return this;
    }

    @Override
    protected T createCustomer() {
        T organisation = (T) new Organisation();
        organisation.setOrganisationName(organisationName);

        return organisation;
    }
}
