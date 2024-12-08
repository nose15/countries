package org.lukas.countries.service;
import org.json.JSONArray;
import org.lukas.countries.model.Timezone;
import org.lukas.countries.repository.TimezoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TimezoneService {
    private final TimezoneRepository timezoneRepository;

    @Autowired
    public TimezoneService(TimezoneRepository timezoneRepository) {
        this.timezoneRepository = timezoneRepository;
    }

    List<Timezone> createMultiple(JSONArray jsonArray) {
        return new ArrayList<>();
    }
}
