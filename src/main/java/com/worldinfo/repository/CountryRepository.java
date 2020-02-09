package com.worldinfo.repository;

import com.worldinfo.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
public interface CountryRepository extends JpaRepository<Country, String> {
    Optional<Country> findCountryByCode(String code);

}
