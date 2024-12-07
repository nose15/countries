package org.lukas.countries.dtos;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.lukas.countries.models.Country;

import java.util.ArrayList;
import java.util.List;

public class CountryDTO {
    private String commonName;
    private String officialName;
    private String capital;
    private String region;
    private String subregion;
    private long population;
    private List<String> currencies;
    private List<String> languages;
    private List<String> borders;
    private List<String> timezones;

    public CountryDTO(Country country) {
        this.commonName = country.getName();
        this.officialName = country.getOfficialName();
        this.capital = country.getCapital();
        this.region = country.getRegion();
        this.subregion = country.getSubRegion();
        this.population = country.getPopulation();
        this.currencies = parseJsonArray(country.getCurrenciesJson());
        this.languages = parseJsonArray(country.getLanguagesJson());
        this.borders = parseJsonArray(country.getBordersJson());
        this.timezones = parseJsonArray(country.getTimezonesJson());
    }

    List<String> parseJsonArray(String jsonString) {
        String[] values = jsonString.substring(1,jsonString.length() - 2).split(",");
        for (int i = 0; i < values.length; i++) {
            values[i] = values[i].trim().replace("\\", "").replace("\"", "");
        }
        return List.of(values);
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getOfficialName() {
        return officialName;
    }

    public void setOfficialName(String officialName) {
        this.officialName = officialName;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public List<String> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<String> currencies) {
        this.currencies = currencies;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public List<String> getBorders() {
        return borders;
    }

    public void setBorders(List<String> borders) {
        this.borders = borders;
    }

    public List<String> getTimezones() {
        return timezones;
    }

    public void setTimezones(List<String> timezones) {
        this.timezones = timezones;
    }
}
