package com.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Flight{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id",length= 20)
    private Long ID;
    @Column(name="FlightNumber",length= 30)
    private String FlightNumber;
    
    @Column(name="DepartureAirport",length = 30)
    private String departureAirport;
    
    @Column(name="DestinationAirport",length = 30)
    private String DestinationAirport;
    
    @Column(name="DepartureDatetime",length = 30)
    private String departuredatetime;
    
    @Column(name="DestinationDatetime",length = 30)
    private String destinationdatetime;
    
    @Column(name="ArrivalDatetime",length = 30)
    private String arrivaldatetime;
    
    @Column(name="TotalSeats",length = 30)
    private String Totalseats;
    
    @Column(name="AvailableSeats",length = 30)
    private String availableseats;
    
    @Column(name="TicketPrice",length = 30)
    private String ticketprice;
    
}

    
    


