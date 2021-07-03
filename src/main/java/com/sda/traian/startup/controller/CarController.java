package com.sda.traian.startup.controller;

import com.sda.traian.startup.model.car.Car;
import com.sda.traian.startup.service.CarService;
import com.sda.traian.startup.service.dto.CarDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }
    @GetMapping("/addcar")
    public String showAddCarPage(CarDTO car){
        return "addcar";
    }

    @PostMapping("/addcar")
    public String addCar(@Valid CarDTO car, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){
            return "addcar";
        }
        carService.addCar(car);

        // TODO: sa nu uitam sa populam modelul cand implementam listcars
        return "listcars";
    }
}
