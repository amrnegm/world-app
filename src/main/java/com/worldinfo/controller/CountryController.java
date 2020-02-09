package com.worldinfo.controller;

import com.worldinfo.dto.CountryDto;
import com.worldinfo.model.Country;
import com.worldinfo.service.CountryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/{code}")
    public CountryDto getCountry(@PathVariable(name = "code") String code) {
        Country country = countryService.getCountry(code);

        CountryDto postDto = modelMapper.map(country, CountryDto.class);
        postDto.setCountryLanguage(country.getLanguages());
        return postDto;
    }
}
