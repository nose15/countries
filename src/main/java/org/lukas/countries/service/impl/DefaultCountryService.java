package org.lukas.countries.service.impl;

import org.lukas.countries.dtos.CountryDTO;
import org.lukas.countries.exceptions.ResourceNotFoundException;
import org.lukas.countries.models.Country;
import org.lukas.countries.repository.CountryRepository;
import org.lukas.countries.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DefaultCountryService implements CountryService {
    private final CountryRepository countryRepository;

    @Autowired
    public DefaultCountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public CountryDTO getByCode(String code) {
        Country country = countryRepository.findByCode(code);

        if (country == null) {
            throw new ResourceNotFoundException("No country with code " + code);
        }

        return new CountryDTO(country);
    }

    @Override
    public List<CountryDTO> getAll() {
        Iterable<Country> countryIterable = countryRepository.findAll();
        List<CountryDTO> countries = new ArrayList<>();
        for (Country country : countryIterable) {
            countries.add(new CountryDTO(country));
        }
        return countries;
    }
}
