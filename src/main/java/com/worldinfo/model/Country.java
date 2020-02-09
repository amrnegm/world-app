package com.worldinfo.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
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

    @Column(name = "life_expectancy")
    private Float lifeExpectancy;

}
