package com.example.tickets_order_spring.service;

//import com.example.tickets_order_spring.models.entity.Plane;
import com.example.tickets_order_spring.models.entity.Ticket;
import com.example.tickets_order_spring.repository.dao.TicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketsServiceImpl implements TicketService {
   @Autowired
   private TicketRepo ticketRepo;

//    @Override
//    public List<Ticket> getTickets(Plane plane) {
//   List<Ticket> tickets = ticketRepo.findAllByIsSoldFalse(Math.toIntExact(plane.getId()));
//        return ticketRepo.findAll();
//    }

//    public List<Ticket> getSoldTickets(int id){
//
//        return ticketRepo.findAllByIsSoldTrue(id);
//    }


    @Override
    public List<Ticket> showTickets() {
        return ticketRepo.findAll();
    }

    @Override
    public Ticket getTicket(int id) {
        Ticket ticket = null;
        Optional<Ticket> optionalTicket = ticketRepo.findById(id);
        if(optionalTicket.isPresent())
            ticket=optionalTicket.get();
        return ticket;
    }

    @Override
    public Ticket updateTicket(Ticket ticket) {
        return ticketRepo.save(ticket);
    }

    @Override
    public Ticket setAsDeleted(int id) {
       Ticket ticket = ticketRepo.getById(id);
       ticket.setDeleted(true);
       return ticketRepo.save(ticket);
    }
}
