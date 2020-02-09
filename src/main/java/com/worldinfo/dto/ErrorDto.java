package com.worldinfo.dto;

import com.worldinfo.model.CountryLanguage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
public class ErrorDto {

    private String message;

}
