package org.lukas.countries.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "COUNTRIES")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String name;
    private String officialName;
    private String capital;
    private String region;
    private String subRegion;
    private long population;

    @Column(name = "currencies", columnDefinition = "TEXT")
    @Convert(converter = JsonArrayConverter.class)
    private List<String> currencies;

    @Column(name = "languages", columnDefinition = "TEXT")
    @Convert(converter = JsonArrayConverter.class)
    private List<String> languages;

    @Column(name = "borders", columnDefinition = "TEXT")
    @Convert(converter = JsonArrayConverter.class)
    private List<String> borders;

    @Column(name = "timezones", columnDefinition = "TEXT")
    @Convert(converter = JsonArrayConverter.class)
    private List<String> timezones;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
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

    public String getSubRegion() {
        return subRegion;
    }

    public void setSubRegion(String subRegion) {
        this.subRegion = subRegion;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
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

    public List<String> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<String> currencies) {
        this.currencies = currencies;
    }
}
