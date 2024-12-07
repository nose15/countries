package org.lukas.countries.services.countryservice;

import org.lukas.countries.dtos.CountryDTO;
import org.lukas.countries.dtos.CountryListDTO;

import java.util.Optional;

public interface CountryService {
    CountryDTO getByCode(String code);
    CountryListDTO getAll();
}
