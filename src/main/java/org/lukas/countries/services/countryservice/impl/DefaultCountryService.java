package org.lukas.countries.services.countryservice.impl;

import org.lukas.countries.dtos.CountryDTO;
import org.lukas.countries.dtos.CountryListDTO;
import org.lukas.countries.services.countryservice.CountryService;
import org.springframework.stereotype.Service;

@Service
public class DefaultCountryService implements CountryService {
    CountryDTO getByCode(String code) {
        return new CountryDTO();
    }

    CountryListDTO getAll() {
        return new CountryListDTO();
    }

}
