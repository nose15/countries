package org.lukas.countries.models;

import jakarta.persistence.*;

@Entity
@Table(name = "COUNTRIES")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String name;
    private String officialName;
    @Column(name = "currencies")
    private String currenciesJson;
    private String capital;
    private String region;
    private String subRegion;
    @Column(name = "languages")
    private String languagesJson;
    private long population;
    @Column(name = "borders")
    private String bordersJson;
    @Column(name = "timezones")
    private String timezonesJson;

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

    public String getCurrenciesJson() {
        return currenciesJson;
    }

    public void setCurrenciesJson(String currenciesJson) {
        this.currenciesJson = currenciesJson;
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

    public String getLanguagesJson() {
        return languagesJson;
    }

    public void setLanguagesJson(String languagesJson) {
        this.languagesJson = languagesJson;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getBordersJson() {
        return bordersJson;
    }

    public void setBordersJson(String bordersJson) {
        this.bordersJson = bordersJson;
    }

    public String getTimezonesJson() {
        return timezonesJson;
    }

    public void setTimezonesJson(String timezonesJson) {
        this.timezonesJson = timezonesJson;
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
}
