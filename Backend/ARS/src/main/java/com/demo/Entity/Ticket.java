package com.demo.Entity;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
public class Ticket {

		    @Id
		    @GeneratedValue(strategy = GenerationType.IDENTITY)
		    @Column(name="TicketId",length= 20)
		    private Long TicketId;

		    @ManyToOne
		    @JoinColumn(name = "userId")
		    @Column(name="user",length= 20)
		    private User user;
		    
		    @ManyToOne
		    @JoinColumn(name = "FlightId")
		    @Column(name="flight",length= 20)
		    private Flight flight;
		    

		    @ManyToOne
		    @Column(name="SeatNumber",length= 20)
		    private LocalDate seatnumber;
		    @Column(name="TicketStatus",length= 20)
		    private Double ticketstatus;
		    @Column(name="TicketPrice",length= 20)
		    private String ticketprice;
		    @Column(name="Date",length = 30)
		    private String date;


		    }
		
