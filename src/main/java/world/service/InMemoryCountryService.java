package world.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import world.dto.CountryEnvelope;
import world.model.Country;
import world.model.World;

import java.util.Collection;

@Service("InMemory")
public class InMemoryCountryService implements CountryService {

    @Autowired
    World world;

    @Override
    public Collection<Country> getCountries() {
        return world.getCountryMap().values();
    }

    @Override
    public Country getCountry(String id) {
        return world.getCountryMap().get(id.toUpperCase());
    }

    @Override
    public Country createCountry(CountryEnvelope countryEnvelope) {
        String id = countryEnvelope.getId().toUpperCase();
        world.getCountryMap().put(id, countryEnvelope.getCountry());
        return getCountry(id);
    }

    @Override
    public Country deleteCountry(String id) {
        Country country = getCountry(id);
        world.getCountryMap().remove(id.toUpperCase());
        return country;
    }
}
