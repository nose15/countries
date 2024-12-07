package org.lukas.countries.services.countryservice.impl;

import org.lukas.countries.dtos.CountryDTO;
import org.lukas.countries.dtos.CountryListDTO;
import org.lukas.countries.exceptions.ResourceNotFoundException;
import org.lukas.countries.services.countryservice.CountryService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DefaultCountryService implements CountryService {

    @Override
    public CountryDTO getByCode(String code) {
        return new CountryDTO();
    }

    @Override
    public CountryListDTO getAll() {
        return new CountryListDTO();
    }

}
