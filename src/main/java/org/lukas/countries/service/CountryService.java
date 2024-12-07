package org.lukas.countries.service;

import org.lukas.countries.dtos.CountryDTO;

import java.util.List;

public interface CountryService {
    CountryDTO getByCode(String code);
    List<CountryDTO> getAll();
}
