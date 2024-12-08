package org.lukas.countries.service;

import org.lukas.countries.dto.CountryCreationDTO;
import org.lukas.countries.exception.ResourceNotFoundException;
import org.lukas.countries.model.Country;
import org.lukas.countries.model.Currency;
import org.lukas.countries.model.Language;
import org.lukas.countries.model.Timezone;
import org.lukas.countries.repository.CountryRepository;
import org.lukas.countries.repository.CurrencyRepository;
import org.lukas.countries.repository.LanguageRepository;
import org.lukas.countries.repository.TimezoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    private final CountryRepository countryRepository;
    private final CurrencyRepository currencyRepository;
    private final LanguageRepository languageRepository;
    private final TimezoneRepository timezoneRepository;

    @Autowired
    public CountryService(CountryRepository countryRepository, CurrencyRepository currencyRepository, LanguageRepository languageRepository, TimezoneRepository timezoneRepository) {
        this.countryRepository = countryRepository;
        this.currencyRepository = currencyRepository;
        this.languageRepository = languageRepository;
        this.timezoneRepository = timezoneRepository;
    }

    public Country getByCode(String code) {
        return countryRepository.findByCode(code.toUpperCase())
                .orElseThrow(() -> new ResourceNotFoundException("No country with code " + code));
    }

    public List<Country> getAll() {
        return countryRepository.findAll();
    }

    public void createDirectly(Country country) {
        countryRepository.save(country);
    }

    public void create(Country country) {
        currencyRepository.saveAll(country.getCurrencies());
        languageRepository.saveAll(country.getLanguages());
        timezoneRepository.saveAll(country.getTimezones());

        countryRepository.save(country);
    }
}
