package com.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id",length= 20)
    private Long ID;
    @Column(name="Type",length= 30)
    private String type;
    @Column(name="Date",length = 30)
    private String date;
    
    @ManyToOne
    @JoinColumn(name = "userId")
    @Column(name="user",length= 20)
    private User user;

    
}

    
  
    


