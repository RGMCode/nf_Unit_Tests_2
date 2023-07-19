package com.example.nf_unit_tests_2;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository {
    void save(Car car);

    List<Car> findAll();

    void deleteById(String id);
}
