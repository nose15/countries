package org.lukas.countries.dto;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

public class CountryCreationDTO {
    @JsonProperty("code")
    private String code;
    @JsonProperty("name")
    private String name;
    @JsonProperty("official_name")
    private String officialName;
    @JsonProperty("capital")
    private String capital;
    @JsonProperty("region")
    private String region;
    @JsonProperty("subregion")
    private String subregion;
    @JsonProperty("population")
    private long population;
    @JsonProperty("languages")
    private JSONArray languages;
    @JsonProperty("currencies")
    private JSONArray currencies;
    @JsonProperty("timezones")
    private JSONArray timezones;
    @JsonProperty("borders")
    private JSONArray borders;

    public JSONArray getLanguages() {
        return languages;
    }

    public void setLanguages(JSONArray languages) {
        this.languages = languages;
    }

    public JSONArray getCurrencies() {
        return currencies;
    }

    public void setCurrencies(JSONArray currencies) {
        this.currencies = currencies;
    }

    public JSONArray getTimezones() {
        return timezones;
    }

    public void setTimezones(JSONArray timezones) {
        this.timezones = timezones;
    }

    public JSONArray getBorders() {
        return borders;
    }

    public void setBorders(JSONArray borders) {
        this.borders = borders;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
