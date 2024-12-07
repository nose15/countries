package org.lukas.countries.controllers;

import org.lukas.countries.dtos.CountryDTO;
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

    @GetMapping("")
    public ResponseEntity<List<CountryDTO>> getAll() {
        List<CountryDTO> countries = countryService.getAll();
        return new ResponseEntity<>(countries, HttpStatus.OK);
    }

    @GetMapping("/{code}")
    public ResponseEntity<CountryDTO> getByCode(@PathVariable String code) {
        CountryDTO country = countryService.getByCode(code);
        return new ResponseEntity<>(country, HttpStatus.OK);
    }
}
