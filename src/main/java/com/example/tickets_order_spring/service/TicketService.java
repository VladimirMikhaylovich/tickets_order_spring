package com.example.tickets_order_spring.service;

//import com.example.tickets_order_spring.models.entity.Plane;
import com.example.tickets_order_spring.models.entity.Ticket;

import java.util.List;

public interface TicketService {
    //public List<Ticket> getTickets(Plane plane);
    public List<Ticket> showTickets();
    public Ticket getTicket(int id);
    public Ticket updateTicket(Ticket ticket);
    public Ticket setAsDeleted(int id);
}
