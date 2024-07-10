package com.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class FlightDTO {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(length = 60, nullable = false)
    private String number;
    
    @Column(length = 100, nullable = false)
    private String departureairport;
    
    @Column(length = 100, nullable = false)
    private String destinationairport;
    
    @Column(length = 100, nullable = false)
    private String departuredatetime;
    
    @Column(length = 100, nullable = false)
    private String arrivaldatetime;
    
    @Column(length = 100, nullable = false)
    private String totalseats;
    
    @Column(length = 100, nullable = false)
    private String availableseats;
    
    @Column(length = 100, nullable = false)
    private String ticketprice;
}
