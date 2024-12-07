package org.lukas.countries.service.impl;

import org.lukas.countries.dtos.CountryDTO;
import org.lukas.countries.dtos.CountryListDTO;
import org.lukas.countries.models.Country;
import org.lukas.countries.repository.CountryRepository;
import org.lukas.countries.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        System.out.println(country);
        return new CountryDTO();
    }

    @Override
    public CountryListDTO getAll() {
        return new CountryListDTO();
    }

}
