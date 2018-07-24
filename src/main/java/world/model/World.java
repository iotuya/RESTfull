package world.model;

import java.util.Map;

public class World {
    private Map<String, Country> countryMap;

    public Map<String, Country> getCountryMap() {
        return countryMap;
    }

    public World setCountryMap(Map<String, Country> countryMap) {
        this.countryMap = countryMap;
        return this;
    }
}