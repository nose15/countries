package org.lukas.countries.models;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.json.JSONArray;

import java.util.List;

@Converter
public class JsonArrayConverter implements AttributeConverter<List<String>, String> {
    @Override
    public String convertToDatabaseColumn(List<String> strings) {
        JSONArray jsonArray = new JSONArray(strings);
        return jsonArray.toString();
    }

    @Override
    public List<String> convertToEntityAttribute(String s) {
        JSONArray jsonArray = new JSONArray(s);
        return jsonArray.toList().stream().map((Object obj) -> (String) obj).toList();
    }
}
