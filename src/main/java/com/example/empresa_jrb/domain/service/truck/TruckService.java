package com.example.empresa_jrb.domain.service.truck;

import com.example.empresa_jrb.domain.model.Truck;

import java.util.List;

public interface TruckService {
    Truck saveTruck(Truck truck);
    List<Truck> getAll();
}
