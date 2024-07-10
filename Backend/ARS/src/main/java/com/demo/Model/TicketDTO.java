package com.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class TicketDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ticketid;

    @ManyToOne
    @JoinColumn(name = "userid")
    @JsonIgnoreProperties("tickets")
    private UserDTO user;

    @ManyToOne
    @JoinColumn(name = "flightid")
    @JsonIgnoreProperties("tickets")
    private FlightDTO flight;

    @Column(length = 10)
    private String seatnumber;

    @Column(length = 30)
    private String ticketstatus;

    @Column
    private Double ticketprice;

    @Column
    private String bookingdate;
}

	

	
	
	
	

