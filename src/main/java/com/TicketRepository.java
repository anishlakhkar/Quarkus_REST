package com;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import model.Ticket;

@ApplicationScoped
public class TicketRepository implements PanacheRepository<Ticket> {
}