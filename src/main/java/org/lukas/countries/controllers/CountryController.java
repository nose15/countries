package org.lukas.countries.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/countries")
@RestController
public class CountryController {
    @GetMapping("/")
    public String test() {
        return "eloelo";
    }
}
