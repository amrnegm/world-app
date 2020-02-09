package com.worldinfo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "country")
public class Country {

    @Id
    @Column(columnDefinition = "bpchar(3)")
    private String code;

    @NotNull
    private String name;

    @NotNull
    private String continent;

    @NotNull
    private Integer population;

    private Float life_expectancy;

    @OneToMany(mappedBy = "countryCode")
    private List<CountryLanguage> languages;
}
