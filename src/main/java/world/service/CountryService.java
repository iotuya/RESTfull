package world.service;

import org.springframework.stereotype.Service;
import world.dto.CountryEnvelope;
import world.model.Country;

import java.util.Collection;

@Service
public interface CountryService {

    Collection<Country> getCountries();

    Country getCountry(String id);

    Country createCountry(CountryEnvelope countryEnvelope);

    Country deleteCountry(String id);

    Country updateCountry(String id, Country country);
}