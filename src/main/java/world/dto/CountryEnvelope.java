package world.dto;

import world.model.Country;

public class CountryEnvelope {
    String id;
    Country country;

    public String getId() {
        return id;
    }

    public CountryEnvelope setId(String id) {
        this.id = id;
        return this;
    }

    public Country getCountry() {
        return country;
    }

    public CountryEnvelope setCountry(Country country) {
        this.country = country;
        return this;
    }
}
