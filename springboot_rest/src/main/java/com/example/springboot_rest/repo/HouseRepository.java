package com.example.springboot_rest.repo;

import com.example.springboot_rest.entity.House;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface HouseRepository extends JpaRepository<House, Long> {

}
