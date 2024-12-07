package org.lukas.countries.service.impl;

import org.lukas.countries.dtos.CountryDTO;
import org.lukas.countries.dtos.CountryListDTO;
import org.lukas.countries.service.CountryService;
import org.springframework.stereotype.Service;

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
