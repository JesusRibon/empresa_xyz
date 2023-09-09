package com.example.empresa_jrb.infrastructure.api.controller.driver;


import com.example.empresa_jrb.domain.model.Driver;
import com.example.empresa_jrb.domain.service.driver.DriverService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/driver")
@AllArgsConstructor
public class DriverController {
    private final DriverService driverService;
    @PostMapping
    public Driver save(@RequestBody Driver driver){
        return driverService.saveDriver(driver);
    }
    @GetMapping
    public ResponseEntity<List<Driver>> getAll(){
        return ResponseEntity.ok(driverService.getAll());
    }
}
