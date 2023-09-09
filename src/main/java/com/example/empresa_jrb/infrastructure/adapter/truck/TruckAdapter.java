package com.example.empresa_jrb.infrastructure.adapter.truck;

import com.example.empresa_jrb.domain.model.Truck;
import com.example.empresa_jrb.domain.service.truck.TruckService;
import com.example.empresa_jrb.infrastructure.dto.TruckDto;
import com.example.empresa_jrb.infrastructure.mapper.truck.TruckMapper;
import com.example.empresa_jrb.infrastructure.repository.truck.TruckRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TruckAdapter implements TruckService {
    private final TruckMapper truckMapper;
    private final TruckRepository truckRepository;
    @Override
    public Truck saveTruck(Truck truck) {
        return truckMapper.toTruckEntity(truckRepository.save(truckMapper.toTruckDto(truck)));
    }

    @Override
    public List<Truck> getAll() {
        List<TruckDto> truckDtos = truckRepository.findAll();
        return truckDtos.stream().map(truckMapper::toTruckEntity).toList();
    }
}
