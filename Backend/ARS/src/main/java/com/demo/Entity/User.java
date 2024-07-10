package com.demo.Entity;

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
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id",length= 20)
    private Long ID;
    
    @Column(name="Name",length= 30)
    private String name;
    
    @Column(name="MobileNo",length = 30)
    private String mobileno;
    
    @Column(name="Email",length = 30)
    private String email;
    
    @Column(name="Address",length = 30)
    private String address;
}

    
    


   