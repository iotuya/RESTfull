package world.service;

import org.springframework.stereotype.Service;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import world.dto.CountryEnvelope;
import world.model.Country;

import java.util.Collection;

@Service("FutureDb")
public class FutureDbCountryService implements CountryService {

    @Override
    public Collection<Country> getCountries() {
        throw new NotImplementedException();
    }

    @Override
    public Country getCountry(String id) {
        throw new NotImplementedException();
    }

    @Override
    public Country createCountry(CountryEnvelope countryEnvelope) {
        throw new NotImplementedException();
    }

    @Override
    public Country deleteCountry(String id) {
        throw new NotImplementedException();
    }
}
