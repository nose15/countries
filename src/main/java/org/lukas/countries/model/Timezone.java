package org.lukas.countries.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.lukas.countries.utils.TimezoneJsonSerializer;

@Entity
@JsonSerialize(using = TimezoneJsonSerializer.class)
public class Timezone {
    @Id
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
