package com.example.tickets_order_spring.service;

import com.example.tickets_order_spring.models.entity.Plane;
import com.example.tickets_order_spring.repository.dao.PlaneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PlaneServiceImpl  implements PlaneServices {
   @Autowired
   private PlaneRepo repository;

    @Override
    public List<Plane> getAll() {
       List<Plane> list = repository.findAll();
//        LocalDate dateToday = LocalDate.now();
//        List<Plane> sortedByDepartList = new ArrayList<>();
//        for(Plane l:list){
//            if(l.getDepart().isAfter(dateToday)){
//                sortedByDepartList.add(l);
//            }
//        }
        return repository.findAllByDepartAfter(LocalDate.now());
        //return list;
    }

    @Override
    public Plane getById(int id) {
        Plane plane =null;
        Optional<Plane> optionalPlane = repository.findById(id);
        if(optionalPlane.isPresent())
            plane = optionalPlane.get();
        return plane;
    }

    @Override
    public Plane addNew(Plane plane) {
       return repository.save(plane);
    }

    @Override
    public Plane updatePlane(Plane plane) {
        return repository.save(plane);
    }

    @Override
    @Transactional
    public Plane setAsDeleted(int id) {
      Plane plane =  repository.getById(id);
        plane.setDeleted(true);
       return repository.save(plane);
    }

}
