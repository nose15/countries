package org.lukas.countries.controller;

import org.lukas.countries.model.Country;
import org.lukas.countries.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/countries")
@RestController
public class CountryController {
    private final CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping({"", "/"})
    public ResponseEntity<List<Country>> getAll() {
        List<Country> countries = countryService.getAll();
        return new ResponseEntity<>(countries, HttpStatus.OK);
    }

    @GetMapping("/{code}")
    public ResponseEntity<Country> getByCode(@PathVariable String code) {
        Country country = countryService.getByCode(code);
        return new ResponseEntity<>(country, HttpStatus.OK);
    }

    @PostMapping({"", "/"})
    public ResponseEntity<String> addCountry(@RequestBody Country country) {
        countryService.create(country);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
