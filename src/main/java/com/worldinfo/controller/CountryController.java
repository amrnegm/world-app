package com.worldinfo.controller;

import com.worldinfo.constant.ErrorCode;
import com.worldinfo.dto.CountryDto;
import com.worldinfo.dto.ErrorDto;
import com.worldinfo.model.Country;
import com.worldinfo.service.CountryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity getCountry(@PathVariable("code") String code) {
        Country country = countryService.getCountry(code);

        if (country == null) {
            return new ResponseEntity(new ErrorDto(ErrorCode.INVALID_COUNTRY_CODE), HttpStatus.INTERNAL_SERVER_ERROR);
        }

        CountryDto countryDto = modelMapper.map(country, CountryDto.class);
        countryDto.setCountryLanguage(country.getLanguages());
        return new ResponseEntity(countryDto, HttpStatus.OK);
    }
}
