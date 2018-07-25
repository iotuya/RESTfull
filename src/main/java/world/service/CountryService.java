package world.service;

import org.springframework.stereotype.Service;
import world.model.Country;

import java.util.Collection;

@Service
public interface CountryService {

    Collection<Country> getCountries();
}
