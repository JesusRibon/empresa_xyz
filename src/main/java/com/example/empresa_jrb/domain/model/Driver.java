package com.example.empresa_jrb.domain.model;

import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Driver {

    private Long id;
    private String name;
    private String lastName;
    private String licenseNumber;
    private String numberId;


}
