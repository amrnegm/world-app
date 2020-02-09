package com.worldinfo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
@Table(name = "country_language")
@IdClass(CountryLanguageId.class)
public class CountryLanguage {

    @Id
    @NotNull
    @Column(name = "country_code", columnDefinition = "bpchar(3)")
    private String countryCode;

    @Id
    @NotNull
    private String language;

}


