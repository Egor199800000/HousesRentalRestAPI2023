package com.example.springboot_rest.controllers;

import com.example.springboot_rest.entity.House;
import com.example.springboot_rest.entity.Views;
import com.example.springboot_rest.repo.HouseRepository;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("house")
public class HouseController {
    private final HouseRepository houseRepository;

    @Autowired
    public HouseController(HouseRepository employeeRepository) {
        this.houseRepository = employeeRepository;
    }

    @GetMapping
    @JsonView(Views.IdName.class)//здесь будут выводится сообщ только с id и name
    public List<House> list(){ //тоесть при запуске приложения мы не будем видеть дату созд уже существ сообщений
        return houseRepository.findAll();
    }

}
