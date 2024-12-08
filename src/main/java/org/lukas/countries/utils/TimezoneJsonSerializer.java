package org.lukas.countries.utils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.lukas.countries.model.Timezone;

import java.io.IOException;
import java.util.List;

public class TimezoneJsonSerializer extends JsonSerializer<Timezone> {
    @Override
    public void serialize(Timezone timezone, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(timezone.getCode());
    }
}
