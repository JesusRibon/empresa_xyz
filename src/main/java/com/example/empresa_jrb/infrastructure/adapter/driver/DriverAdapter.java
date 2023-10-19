package com.example.empresa_jrb.infrastructure.adapter.driver;

import com.example.empresa_jrb.domain.model.Driver;
import com.example.empresa_jrb.domain.service.driver.DriverService;
import com.example.empresa_jrb.infrastructure.dto.DriverDto;
import com.example.empresa_jrb.infrastructure.mapper.driver.DriverMapper;
import com.example.empresa_jrb.infrastructure.repository.driver.DriverRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class DriverAdapter implements DriverService {

    private final DriverRepository driverRepository;

    private final DriverMapper driverMapper;
    @Override
    public Driver saveDriver(Driver driver) {
        return driverMapper.toDriverEntity(driverRepository.save(driverMapper.toDriverDto(driver)));
    }

    @Override
    public List<Driver> getAll() {
        List<DriverDto> driverDtos = driverRepository.findAll();
        return driverDtos.stream().map(driverMapper::toDriverEntity).toList();
    }

    @Override
    public Driver driverById(String numberId )   {
        Optional<DriverDto> driverDto = driverRepository.findById(Long.valueOf(numberId));
            return driverDto.map(this::buildDriver).orElse(null);

    }

    @Transactional
    public void updateDriver(Driver driver, String id) {

    }

    @Override
    public void deleteDriver(String id) {
        driverRepository.deleteById(Long.valueOf(id));
    }

    private Driver buildDriver(DriverDto driverDto){
        return new Driver(driverDto.getId(),driverDto.getName(),driverDto.getLastName()
                ,driverDto.getLicenseNumber(),driverDto.getNumberId());
    }

}
