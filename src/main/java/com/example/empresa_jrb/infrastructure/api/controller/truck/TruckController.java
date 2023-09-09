package com.example.empresa_jrb.infrastructure.api.controller.truck;

import com.example.empresa_jrb.domain.model.Truck;
import com.example.empresa_jrb.domain.service.truck.TruckService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/truck")
@AllArgsConstructor
public class TruckController {
    private final TruckService truckService;
    @PostMapping
    public Truck save(@RequestBody Truck truck){
        return truckService.saveTruck(truck);
    }
    @GetMapping
    public ResponseEntity<List<Truck>> getAll(){
        return ResponseEntity.ok(truckService.getAll());
    }
}
