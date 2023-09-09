package com.example.empresa_jrb.domain.service.driver;

import com.example.empresa_jrb.domain.model.Driver;

import java.util.List;

public interface DriverService {

    Driver saveDriver(Driver driver);

    List<Driver> getAll();
}
