package org.lukas.countries.repository;

import org.lukas.countries.models.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {
    Country findByCode(String code);
}
