package org.lukas.countries.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.*;
import org.lukas.countries.converter.JsonArrayConverter;
import org.lukas.countries.utils.TimezoneJsonSerializer;

import java.util.List;

@Entity
@Table(name = "COUNTRIES")
public class Country {
    @Id
    @JsonProperty("code")
    private String code;
    @JsonProperty("name")
    private String name;
    @JsonProperty("official_name")
    private String officialName;
    @JsonProperty("region")
    private String region;
    @JsonProperty("subregion")
    private String subRegion;
    @JsonProperty("population")
    private long population;

    @Column(name = "currencies", columnDefinition = "TEXT")
    @ManyToMany
    @JsonProperty("currencies")
    private List<Currency> currencies;

    @Column(name = "languages", columnDefinition = "TEXT")
    @ManyToMany
    @JsonProperty("languages")
    private List<Language> languages;

    @Column(name = "timezones", columnDefinition = "TEXT")
    @ManyToMany
    @JsonProperty("timezones")
    @JsonSerialize(using = TimezoneJsonSerializer.class)
    private List<Timezone> timezones;

    @JsonProperty("capital")
    @Column(name = "capital", columnDefinition = "TEXT")
    @Convert(converter = JsonArrayConverter.class)
    private List<String> capital;

    @Column(name = "borders", columnDefinition = "TEXT")
    @Convert(converter = JsonArrayConverter.class)
    @JsonProperty("borders")
    private List<String> borders;

    public String getOfficialName() {
        return officialName;
    }

    public void setOfficialName(String officialName) {
        this.officialName = officialName;
    }

    public List<String> getCapital() {
        return capital;
    }

    public void setCapital(List<String> capital) {
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
