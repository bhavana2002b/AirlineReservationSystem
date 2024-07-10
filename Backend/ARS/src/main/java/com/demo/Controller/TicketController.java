package com.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Entity.Ticket;
import com.demo.Model.TicketDTO;
import com.demo.Service.TicketService;
import com.demo.Util.Converter;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class TicketController {
	
	@Autowired
	TicketService ticketService;
	
	@Autowired
	Converter converter;
	
	@PostMapping("/createTicket")
	public String createTicket(@RequestBody TicketDTO ticketDTO)
	{
		final Ticket ticket = converter.covertToTicketEntity(ticketDTO);
		return ticketService.createTicket(ticket);
	}

	@DeleteMapping("/deleteticket/{id}")
	public String deleteTicket(@PathVariable("id") int id)
	{
		return ticketService.deleteTicket(id);
	}
	
	@PutMapping("/updateTicket/{id}")
	public ResponseEntity<TicketDTO> updateTicket(@PathVariable ("id") int id, @RequestBody TicketDTO ticketDTO)
	{
		final Ticket ticket = converter.covertToTicketEntity(ticketDTO);
		return new ResponseEntity<TicketDTO>(ticketService.updateTicket(id, ticket), HttpStatus.OK);
	}
	
	@GetMapping("/getPaymentById/{id}")
	public TicketDTO getTicketById(@PathVariable("id") int id)
	{
		return ticketService.getTicketById(id);
	}
		
	//assign Booking to Admin
	@PostMapping("/assignTicket/{bookId}/{aId}")
	public ResponseEntity<Ticket> assignTicket(@PathVariable("bookId") int bookId, @PathVariable("aId") int aId)
	{
		return new ResponseEntity<Ticket>(ticketService.assignTicket(bookId, aId), HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllTickets")
	public List<TicketDTO> getAlltickets()
	{
		return ticketService.getAllTickets();
	}
	
	@GetMapping("/getTicketByUser_Id/{user_id}")
	public ResponseEntity<TicketDTO> getUserByUser_Id(@PathVariable("user_id") String user_id)
	{
		return new ResponseEntity<TicketDTO>(ticketService.getTicketByUser_Id(user_id), HttpStatus.OK);
	}	
	
	@GetMapping("/getTicketByFlight_Id/{flight_id}")
	public ResponseEntity<TicketDTO> getTicketByFlight_Id(@PathVariable("flight_id") String flight_id)
	{
		return new ResponseEntity<TicketDTO>(ticketService. getTicketByFlight_Id(flight_id), HttpStatus.OK);
	}	
	
	@GetMapping("/getTicketBySeatNumber/{seatnumber}")
	public ResponseEntity<TicketDTO> getTicketBySeatNumber(@PathVariable("seatnumber") String seatnumber)
	{
		return new ResponseEntity<TicketDTO>(ticketService.getTicketBySeatNumber(seatnumber), HttpStatus.OK);
	}	
	
	@GetMapping("/getTicketByTicketStatus/{ticketstatus}")
	public ResponseEntity<TicketDTO> getTicketByTicketStatus(@PathVariable("ticketstatus") String ticketstatus)
	{
		return new ResponseEntity<TicketDTO>(ticketService.getTicketByTicketStatus(ticketstatus), HttpStatus.OK);
	}	
	
	@GetMapping("/getTicketByTicketPrice/{ticketprice}")
	public ResponseEntity<TicketDTO> getTicketByTicketPrice(@PathVariable("ticketprice") String ticketprice)
	{
		return new ResponseEntity<TicketDTO>(ticketService.getTicketByTicketPrice(ticketprice), HttpStatus.OK);
	}
	
	@GetMapping("/getTicketByBookingDate/{bookingdate}")
	public ResponseEntity<TicketDTO> getTicketByBookingDate(@PathVariable("bookingdate") String bookingdate)
	{
		return new ResponseEntity<TicketDTO>(ticketService.getTicketByBookingDate(bookingdate), HttpStatus.OK);
	}
}
