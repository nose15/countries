package org.lukas.countries.controllers;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/countries")
@RestController
public class CountryController {
    @GetMapping("/")
    public String getAll() {
        return "";
    }

    @GetMapping("/{code}")
    public String getByCode(@PathVariable String code) {
        return code;
    }
}
