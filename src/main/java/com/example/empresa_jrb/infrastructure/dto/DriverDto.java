package com.example.empresa_jrb.infrastructure.dto;

import com.example.empresa_jrb.domain.model.Truck;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@Entity
public class DriverDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastName;
    private String licenseNumber;
    private String numberId;

}
