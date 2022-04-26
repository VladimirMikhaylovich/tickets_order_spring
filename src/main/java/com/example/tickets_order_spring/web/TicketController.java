package com.example.tickets_order_spring.web;

import com.example.tickets_order_spring.models.entity.Ticket;
import com.example.tickets_order_spring.models.entity.User;
import com.example.tickets_order_spring.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class TicketController {
  @Autowired
  private TicketService ticketService;

//  @GetMapping("/planes/{id}/tickets/")
//  public List<Ticket> showAllTickets(){
//    List<Ticket> tickets = ticketService.getTickets();
//  }

//  @GetMapping("plains/{plainId}/tickets/{Id}")
//  public Ticket showTicket(){
//
//  }
  @GetMapping("/tickets")
  public List<Ticket> showAllTickets(){
      List<Ticket> tickets = ticketService.showTickets();
      return tickets;
  }
  @GetMapping("/tickets/{id}")
  public Ticket showTheTicket(@PathVariable int id){
    return ticketService.getTicket(id);
  }
  @PutMapping("/tickets")
  public Ticket updateTicket(@RequestBody Ticket ticket){
     return ticketService.updateTicket(ticket);
  }
  @PutMapping("/tickets/{id}")
  public Ticket setDeleted(@PathVariable int id){
    Ticket ticket = ticketService.getTicket(id);
    ticket.setDeleted(true);
    return ticket;
  }
}

