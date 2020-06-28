package io.github.pakhomovalexander.builders;

import io.github.pakhomovalexander.domain.Organisation;

public class OrganisationBuilder<T extends Organisation> extends CustomerBuilder<T, OrganisationBuilder<T>> {
    private String organisationName;

    public CustomerBuilder<T, OrganisationBuilder<T>> organisationName(String organisationName) {
        this.organisationName = organisationName;
        return this;
    }

    @Override
    public T build() {
        T organisation = (T) new Organisation();
        super.setCustomerFields(organisation);
        organisation.setOrganisationName(organisationName);

        return organisation;
    }
}
