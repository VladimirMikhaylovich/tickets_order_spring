package com.example.tickets_order_spring.models.entity;

import javax.persistence.*;
import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Planes")
public class Plane  {
   @OneToMany
    private List<Ticket> tickets;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "places")
    private Integer places;
    @Column(name = "depart")
    private LocalDate depart;
    @Column(name = "start")
    private String pointFrom;
    @Column(name = "finish")
    private String pointTo;
//    @Column(name = "duration")
//    private Duration duration;
    @Column(name = "deleted")
    private boolean isDeleted;

    public Plane(String name, Integer places, LocalDate depart, String pointFrom, String pointTo,
                // Duration duration,
                 boolean isDeleted) {
        this.isDeleted = isDeleted;
        this.name = name;
        this.places = places;
        this.depart = depart;
        this.pointFrom = pointFrom;
        this.pointTo = pointTo;
       // this.duration= duration;
    }

    public Plane() {
    }

//    public List<Ticket> getTickets() {  // Don't need it
//        return tickets;
//    }
//
//    public void setTickets(List<Ticket> tickets) {
//        this.tickets = tickets;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPlaces() {
        return places;
    }

    public void setPlaces(Integer places) {
        this.places = places;
    }

    public LocalDate getDepart() {
        return depart;
    }

    public void setDepart(LocalDate depart) {
        this.depart = depart;
    }

    public String getPointFrom() {
        return pointFrom;
    }

    public void setPointFrom(String pointFrom) {
        this.pointFrom = pointFrom;
    }

    public String getPointTo() {
        return pointTo;
    }

    public void setPointTo(String pointTo) {
        this.pointTo = pointTo;
    }

    public boolean getIsDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
        //getTickets().forEach(ticket -> ticket.setDeleted(true));
    }

//    public Duration getDuration() {
//        return duration;
//    }
//
//    public void setDuration(Duration duration) {
//        this.duration = duration;
//    }
}
