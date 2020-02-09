package com.worldinfo.service;

import com.worldinfo.model.Country;
import org.springframework.stereotype.Service;

@Service
public interface CountryService {
    Country getCountry(String code);
}
