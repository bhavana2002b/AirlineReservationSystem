package com.demo.Service;
import java.util.List;




import com.demo.Entity.Ticket;
import com.demo.Model.TicketDTO;

public interface TicketService {
public String createTicket(Ticket ticket);
public String deleteTicket(int id);
public TicketDTO updateTicket(int id,Ticket ticket);
public List<TicketDTO> getAllTickets();
public TicketDTO getTicketByUser_Id(String user_id);
public TicketDTO getTicketByFlight_Id(String flight_id);
public TicketDTO getTicketBySeatNumber(String seatnumber);
public TicketDTO getTicketByTicketStatus(String ticketstatus);
public TicketDTO getTicketByTicketPrice(String ticketprice);
public TicketDTO getTicketByBookingDate(String bookingdate);
public TicketDTO updateTicketByDate(String bookingdate,Ticket ticket);
public TicketDTO getTicketById(int id); 
public Ticket assignTicket(int bookId, int aId);

}
