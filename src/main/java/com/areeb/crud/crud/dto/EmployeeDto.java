package com.areeb.crud.crud.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

    private long id;

    private String Name;

    private LocalDate DateOfJoining;

    @JsonProperty("IsActive")
    private Boolean IsActive;


}
