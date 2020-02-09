package com.worldinfo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@NoArgsConstructor
class CountryLanguageId implements Serializable {

    @NotNull
    @Column(name = "country_code", columnDefinition = "bpchar(3)")
    private String countryCode;

    @NotNull
    private String language;

}
