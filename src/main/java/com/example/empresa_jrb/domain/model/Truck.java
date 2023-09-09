package com.example.empresa_jrb.domain.model;

import com.example.empresa_jrb.infrastructure.dto.DriverDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Truck {

    private Long id;
    private String brand;
    private String model;
    private String plate;
    private String status;
}
