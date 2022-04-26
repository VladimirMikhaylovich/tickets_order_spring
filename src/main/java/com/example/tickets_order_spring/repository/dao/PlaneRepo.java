package com.example.tickets_order_spring.repository.dao;

import com.example.tickets_order_spring.models.entity.Plane;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface PlaneRepo extends JpaRepository<Plane, Integer> {
    List<Plane> findAllByDepartAfter(LocalDate date);
}
