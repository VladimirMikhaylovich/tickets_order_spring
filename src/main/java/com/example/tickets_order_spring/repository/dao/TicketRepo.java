package com.example.tickets_order_spring.repository.dao;

import com.example.tickets_order_spring.models.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepo extends JpaRepository<Ticket, Integer> {
//    List<Ticket> findAllByIsSoldTrue(int id);
//    List<Ticket> findAllByIsSoldFalse(int id);
}
