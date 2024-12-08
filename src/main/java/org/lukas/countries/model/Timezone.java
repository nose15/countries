package org.lukas.countries.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
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