package com.example.tickets_order_spring.web;


import com.example.tickets_order_spring.models.entity.Plane;
import com.example.tickets_order_spring.service.PlaneServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class PlaneController {
    @Autowired
    private PlaneServices planeServices;

    @GetMapping("/planes")
    public List<Plane> showAllPlanes(){
        List<Plane> planes = planeServices.getAll();
        return planes;
    }

    @GetMapping("/planes/{id}")
    public Plane showThePlane(@PathVariable int id){
        return planeServices.getById(id);

    }
    @PostMapping("/planes")
    public Plane addPlane(@RequestBody Plane plane){

       return planeServices.addNew(plane);
    }

    @PutMapping("/planes")
    public Plane updatePlane(@RequestBody Plane plane){
        return planeServices.updatePlane(plane);
    }

    @PutMapping("/planes{id}")
    public Plane setDeleted(@PathVariable int id){
        return planeServices.setAsDeleted(id);
    }
}
