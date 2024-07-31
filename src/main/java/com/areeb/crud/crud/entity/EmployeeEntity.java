package com.areeb.crud.crud.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;
@Entity

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "employees")
public class EmployeeEntity {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String Name;

    private LocalDate DateOfJoining;

    private Boolean IsActive;

}
