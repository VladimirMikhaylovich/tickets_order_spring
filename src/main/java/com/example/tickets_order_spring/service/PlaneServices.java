package com.example.tickets_order_spring.service;

import com.example.tickets_order_spring.models.entity.Plane;

import java.util.List;

public interface PlaneServices {
    public List<Plane> getAll();

    public Plane getById(int id);

    public Plane addNew(Plane plane);

    public Plane updatePlane(Plane plane);

    public Plane setAsDeleted(int id);
}
