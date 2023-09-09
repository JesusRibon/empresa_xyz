package com.example.empresa_jrb.infrastructure.mapper.driver;

import com.example.empresa_jrb.domain.model.Driver;
import com.example.empresa_jrb.infrastructure.dto.DriverDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DriverMapper {
    DriverDto toDriverDto(Driver driver);
    Driver toDriverEntity(DriverDto driverDto);
}
