package org.lukas.countries.service;

import org.json.JSONArray;
import org.lukas.countries.model.Currency;
import org.lukas.countries.repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CurrencyService {
    private final CurrencyRepository currencyRepository;

    @Autowired
    public CurrencyService(CurrencyRepository currencyRepository) {
        this.currencyRepository = currencyRepository;
    }

    List<Currency> createMultiple(JSONArray jsonArray) {
        return new ArrayList<>();
    }
}
