package org.lukas.countries.model;

import jakarta.persistence.*;
import org.lukas.countries.converter.JsonArrayConverter;

import java.util.List;

@Entity
@Table(name = "COUNTRIES")
public class Country {
    @Id
    private String code;
    private String name;
    private String officialName;
    private String capital;
    private String region;
    private String subRegion;
    private long population;

    @Column(name = "currencies", columnDefinition = "TEXT")
    @ManyToMany
    private List<Currency> currencies;

    @Column(name = "languages", columnDefinition = "TEXT")
    @ManyToMany
    private List<Language> languages;

    @Column(name = "timezones", columnDefinition = "TEXT")
    @ManyToMany
    private List<Timezone> timezones;

    @Column(name = "borders", columnDefinition = "TEXT")
    @Convert(converter = JsonArrayConverter.class)
    private List<String> borders;

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

    public String getSubRegion() {
        return subRegion;
    }

    public void setSubRegion(String subRegion) {
        this.subRegion = subRegion;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<String> getBorders() {
        return borders;
    }

    public void setBorders(List<String> borders) {
        this.borders = borders;
    }

    public List<Currency> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<Currency> currencies) {
        this.currencies = currencies;
    }

    public List<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    public List<Timezone> getTimezones() {
        return timezones;
    }

    public void setTimezones(List<Timezone> timezones) {
        this.timezones = timezones;
    }
}
