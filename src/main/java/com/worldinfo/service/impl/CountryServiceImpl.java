package com.worldinfo.service.impl;

import com.worldinfo.model.Country;
import com.worldinfo.repository.CountryRepository;
import com.worldinfo.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    CountryRepository countryRepository;

    public Country getCountry(String code) {
        return countryRepository.findCountryByCode(code).orElse(null);
    }
}
