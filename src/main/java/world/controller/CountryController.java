package world.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import world.model.Country;
import world.service.CountryService;

import java.util.Collection;

@RestController
public class CountryController {

    @Autowired
    @Qualifier("InMemory")
    CountryService countryService;

    @GetMapping("/countries")
    public Collection<Country> getCountries() {
        return countryService.getCountries();
    }
}