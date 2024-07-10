package com.demo.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.demo.Entity.Ticket;


public interface TicketRepository extends JpaRepository<Ticket, Integer>{
	
@Query("select i from Ticket i where i.TicketId=?1")
List<Ticket> getTicketByTicketId(String ticketid);
	
@Query("select i from Ticket i where i.User_Id=:user_id")	
Ticket	getTicketrByUserId(@Param("User_Id") String user_id);

@Query("select i from Ticket i where i.Flight_Id=:flight_id")	
Ticket	getTicketByFlightId(@Param("Flight_Id") String flight_id);

@Query("select i from Ticket i where i.SeatNumber=:seatnumber")	
Ticket	getTicketBySeatNumber(@Param("SeatNumber") String seatnumber);

@Query("select i from Ticket i where i.TicketStatus=:ticketstatus")	
Ticket	getTicketByTicketStatus(@Param("TicketStatus") String ticketstatus);

@Query("select i from Ticket i where i.TicketPrice=:ticketprice")	
Ticket	getTicketByTicketPrice(@Param("ticketprice") String ticketprice);

@Query("select i from Ticket i where i.BookingDate=:bookingdate")	
Ticket	getFlightByBookingdate(@Param("bookingdate") String bookingdate);



//for testing purpose
Optional<Ticket> findByticketid(String ticketid);
}
