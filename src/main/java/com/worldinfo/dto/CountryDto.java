package com.worldinfo.dto;

import com.worldinfo.model.CountryLanguage;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class CountryDto {

    private String name;

    private String continent;

    private Integer population;

    private Float life_expectancy;

    private String country_language;

    public void setCountryLanguage(List<CountryLanguage> countryLanguageList) {
        this.country_language = countryLanguageList.get(0).getLanguage();
    }

}
