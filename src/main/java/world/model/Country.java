package world.model;

import java.util.List;

public class Country {
    private String name;
    private String nativeName;
    private String phone;
    private String continent;
    private String capital;
    private String currency;
    private List<String> languages;

    public String getName() {
        return name;
    }

    public Country setName(String name) {
        this.name = name;
        return this;
    }

    public String getNativeName() {
        return nativeName;
    }

    public Country setNativeName(String nativeName) {
        this.nativeName = nativeName;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Country setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getContinent() {
        return continent;
    }

    public Country setContinent(String continent) {
        this.continent = continent;
        return this;
    }

    public String getCapital() {
        return capital;
    }

    public Country setCapital(String capital) {
        this.capital = capital;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public Country setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public Country setLanguages(List<String> languages) {
        this.languages = languages;
        return this;
    }
}
