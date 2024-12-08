package org.lukas.countries.dto;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.List;

public class CountryCreationDTO {
    private String code;
    private String name;
    private String officialName;
    private String capital;
    private String region;
    private String subRegion;
    private long population;
    private JSONArray languages;
    private JSONArray currencies;
    private JSONArray timezones;
    private JSONArray borders;

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
}
