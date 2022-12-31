package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketManagerTest {

    @Test
    public void sortTicket() {
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);
        Ticket ticket1 = new Ticket(1,"MSK", "SMF", 200,92);
        Ticket ticket2 = new Ticket(2,"MSK", "SMF", 100,98);
        Ticket ticket3 = new Ticket(3,"MSK", "SPB", 200,186);
        Ticket ticket4 = new Ticket(4,"MSK", "SMF", 400,122);
        Ticket ticket5 = new Ticket(5,"KL", "AST", 800,222);
        Ticket ticket6 = new Ticket(6,"MSK", "SMF", 200,130);
        Ticket ticket7 = new Ticket(7,"LO", "AST", 300,243);
        Ticket ticket8 = new Ticket(8,"MSK", "SMF", 500,99);


        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);


        Ticket[] expected = {ticket2, ticket1, ticket6, ticket4, ticket8};
        Ticket[] actual = manager.findAll("MSK","SMF");

       // }{ticket2, ticket1, ticket6, ticket4};
        //Ticket[] actual = manager.findAll("MSK", "SMF");

        Assertions.assertArrayEquals(expected, actual);

    }
}


