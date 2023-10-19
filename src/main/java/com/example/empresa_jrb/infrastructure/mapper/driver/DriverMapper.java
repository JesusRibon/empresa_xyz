package com.example.empresa_jrb.infrastructure.mapper.driver;

import com.example.empresa_jrb.domain.model.Driver;
import com.example.empresa_jrb.infrastructure.dto.DriverDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DriverMapper {
    DriverDto toDriverDto(Driver driver);

    @Mapping(target = "id" , source = "id")
    @Mapping(target = "name" , source = "name")
    @Mapping(target = "lastName" , source = "lastName")
    @Mapping(target = "licenseNumber" , source = "licenseNumber")
    @Mapping(target = "numberId" , source = "numberId")
    Driver toDriverEntity(DriverDto driverDto);
}
