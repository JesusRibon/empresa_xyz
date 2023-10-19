package com.example.empresa_jrb.infrastructure.repository.driver;

import com.example.empresa_jrb.infrastructure.dto.DriverDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DriverRepository extends JpaRepository<DriverDto, Long> {
    Optional<DriverDto> findByNumberId(String numberId);

    @Query(nativeQuery = true , value = "update driver_dto set name = :name , lastName = :lastName , licenseNumber = :licenseNumber , numberId = :numberId where id = :id")
    @Modifying
    void updateDriver(@Param("id") Long id,
                      @Param("name") String name,
                      @Param("lastName") String lastName,
                      @Param("licenseNumber") String licenseNumber,
                      @Param("numberId") String numberId);
}
