package com.example.empresa_jrb.infrastructure.repository.driver;

import com.example.empresa_jrb.infrastructure.dto.DriverDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DriverRepository extends JpaRepository<DriverDto, Long> {
    Optional<DriverDto> findByNumberId(String numberId);
}
