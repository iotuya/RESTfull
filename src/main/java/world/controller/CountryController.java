package world.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import world.dto.CountryEnvelope;
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

    @GetMapping("/countries/{id}")
    public Country getCountry(@PathVariable("id") String id) {
        return countryService.getCountry(id);
    }

    @PostMapping("/countries")
    public Country createCountry(@RequestBody CountryEnvelope countryEnvelope) {
        return countryService.createCountry(countryEnvelope);
    }

    @DeleteMapping("/countries/{id}")
    public Country deleteCountry(@PathVariable("id") String id) {
        return countryService.deleteCountry(id);
    }

    public Country updateCountry() {
        return null;
    }
}