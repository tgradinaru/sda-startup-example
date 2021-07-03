package com.sda.traian.startup.service;

import com.sda.traian.startup.service.dto.CarDTO;

public interface CarService {
    /**
     * Create a new car for the given CarDTO.
     *
     * @param carDTO, details for the new car
     * @return the id for the newly created car
     */
    Long addCar(CarDTO carDTO);
}
