package com.example.tickets_order_spring.models.entity;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "firstname")
    private String firstname;


    @Column(name = "lastname")
    private String lastname;
    @Column(name = "passport")
    private String passport;

    @OneToMany
    List<Ticket> tickets;

    @Column(name = "deleted")
    private boolean isDeleted;

    public User(String firstname, String lastname, String passport,
                List<Ticket> tickets,
                boolean isDeleted){
        this.firstname = firstname;
        this.lastname = lastname;
        this.passport = passport;
       this.tickets = tickets;
        this.isDeleted = isDeleted;
    }

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

//    public List<Ticket> getTickets() { // Don't need it
//        return tickets;
//    }
//
//    public void setTickets(List<Ticket> tickets) {
//        this.tickets = tickets;
//    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
