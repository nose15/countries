package org.lukas.countries.repository;

import org.lukas.countries.model.Timezone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimezoneRepository extends JpaRepository<Timezone, String> {
}
