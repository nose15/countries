package org.lukas.countries.services.countryservice;

import org.lukas.countries.dtos.CountryDTO;
import org.lukas.countries.dtos.CountryListDTO;

public interface CountryService {
    CountryDTO getByCode(String code);
    CountryListDTO getAll();
}
