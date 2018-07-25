package world.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import world.model.Country;
import world.model.World;

import java.util.Collection;

@Service("InMemory")
public class InMemoryCountryService implements CountryService {

    @Autowired
    World world;

    public Collection<Country> getCountries() {
        return world.getCountryMap().values();
    }
}
