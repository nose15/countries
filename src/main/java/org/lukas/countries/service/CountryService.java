package org.lukas.countries.service;

import org.json.JSONArray;
import org.lukas.countries.dto.CountryCreationDTO;
import org.lukas.countries.exception.ResourceNotFoundException;
import org.lukas.countries.model.Country;
import org.lukas.countries.model.Currency;
import org.lukas.countries.model.Language;
import org.lukas.countries.model.Timezone;
import org.lukas.countries.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    private final CountryRepository countryRepository;
    private final CurrencyService currencyService;
    private final LanguageService languageService;
    private final TimezoneService timezoneService;

    @Autowired
    public CountryService(CountryRepository countryRepository, CurrencyService currencyService, LanguageService languageService, TimezoneService timezoneService) {
        this.countryRepository = countryRepository;
        this.currencyService = currencyService;
        this.languageService = languageService;
        this.timezoneService = timezoneService;
    }

    public Country getByCode(String code) {
        return countryRepository.findByCode(code.toUpperCase())
                .orElseThrow(() -> new ResourceNotFoundException("No country with code " + code));
    }

    public List<Country> getAll() {
        return countryRepository.findAll();
    }

    public void create(CountryCreationDTO dto) {
        List<Currency> currencies = currencyService.createMultiple(dto.getCurrencies());
        List<Language> languages = languageService.createMultiple(dto.getLanguages());
        List<Timezone> timezones = timezoneService.createMultiple(dto.getTimezones());
        List<String> borders = dto.getBorders().toList().stream()
                .map((Object element) -> (String) element).toList();

        Country country = new Country();
        country.setBorders(borders);
        country.setCapital(dto.getCapital());
        country.setCode(dto.getCode());
        country.setCurrencies(currencies);
        country.setLanguages(languages);
        country.setName(dto.getName());
        country.setOfficialName(dto.getOfficialName());
        country.setPopulation(dto.getPopulation());
        country.setRegion(dto.getRegion());
        country.setSubRegion(dto.getSubRegion());
        country.setTimezones(timezones);

        countryRepository.save(country);
    }
}
