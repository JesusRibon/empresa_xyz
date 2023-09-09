package com.example.empresa_jrb.infrastructure.repository.truck;

import com.example.empresa_jrb.infrastructure.dto.TruckDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TruckRepository extends JpaRepository<TruckDto,Long> {
}
