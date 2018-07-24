package world.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import world.model.Country;
import world.service.CountryService;

import javax.validation.constraints.NotNull;
import java.util.Collection;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    CountryService countryService;

    @GetMapping("/")
    public Collection<Country> getCountries() {
        return countryService.getCountries();
    }

    @GetMapping("/{key}")
    public Country getCountry(final @NotNull @PathVariable(value = "key") String key) {
        return null;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Country createCountry(final @RequestBody Country Country) {
        return null;
    }

    @PutMapping(value = "/{key}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Country updateCountry(final @NotNull @PathVariable(value = "key") String key,
                                 final @NotNull @RequestBody Country country) {
        return null;
    }

    @DeleteMapping(value = "/{key}")
    public Country deleteCountry(final @NotNull @PathVariable(value = "key") String key) {
        return null;
    }
}
