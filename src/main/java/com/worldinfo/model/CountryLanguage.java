package com.worldinfo.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Entity
@Table(name = "country_language")
public class CountryLanguage {

    @EmbeddedId
    private CountryLanguageId countryLanguageId;
}


