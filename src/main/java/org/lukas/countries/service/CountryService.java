package org.lukas.countries.service;

import org.lukas.countries.models.Country;

import java.util.List;

public interface CountryService {
    Country getByCode(String code);
    List<Country> getAll();
}
