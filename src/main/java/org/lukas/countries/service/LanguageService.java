package org.lukas.countries.service;

import org.json.JSONArray;
import org.lukas.countries.model.Language;
import org.lukas.countries.repository.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LanguageService {
    private final LanguageRepository languageRepository;

    @Autowired
    public LanguageService(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    List<Language> createMultiple(JSONArray jsonArray) {
        return new ArrayList<>();
    }
}
