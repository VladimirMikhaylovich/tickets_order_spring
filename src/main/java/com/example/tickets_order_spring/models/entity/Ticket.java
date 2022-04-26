package com.example.tickets_order_spring.models.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "tickets")
public class Ticket {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "id")
     private int id;

    @Column(name = "deleted")
    private boolean isDeleted;
    @Column(name = "sold")
    private boolean isSold;

    @ManyToOne
    @JoinColumn(name = "plane_id")
    private Plane plane;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private  User user;

    @Column(name = "price")
     private int price;



     public Ticket() {
    }

    public Ticket( User user, int price,
                   Plane plane,
                   boolean isDeleted) {
         this.plane = plane;
        this.user = user;
        this.price = price;
        this.isDeleted = isDeleted;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public boolean getIsSold() {
        return isSold;
    }

    public void setIsSold(boolean idSold) {
        this.isSold = idSold;
    }
}