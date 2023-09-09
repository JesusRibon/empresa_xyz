package com.example.empresa_jrb.infrastructure.mapper.truck;

import com.example.empresa_jrb.domain.model.Truck;
import com.example.empresa_jrb.infrastructure.dto.TruckDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TruckMapper {
    TruckDto toTruckDto(Truck truck);

    Truck toTruckEntity(TruckDto truckDto);
}
