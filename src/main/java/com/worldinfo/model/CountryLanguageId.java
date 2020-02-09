package com.worldinfo.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Embeddable
class CountryLanguageId implements Serializable {

    @NotNull
    @Column(name = "country_code", columnDefinition = "bpchar(3)")
    private String countryCode;

    @NotNull
    private String language;

}
