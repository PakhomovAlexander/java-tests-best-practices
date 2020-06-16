package io.github.pakhomovalexander.domain;

import java.util.Objects;

public class Organisation extends AbstractCustomer {

    private String organisationName;

    @Override
    public String getWelcomeName() {
        return organisationName;
    }

    public String getOrganisationName() {
        return organisationName;
    }

    public void setOrganisationName(String organisationName) {
        this.organisationName = organisationName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Organisation that = (Organisation) o;
        return Objects.equals(organisationName, that.organisationName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), organisationName);
    }

    @Override
    public String toString() {
        return "Organisation{" +
                "organisationName='" + organisationName + '\'' +
                '}';
    }
}
