package world.service;

import org.springframework.stereotype.Service;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import world.model.Country;

import java.util.Collection;

@Service("FutureDb")
public class FutureDbCountryService implements CountryService {

    @Override
    public Collection<Country> getCountries() {
        throw new NotImplementedException();
    }
}
