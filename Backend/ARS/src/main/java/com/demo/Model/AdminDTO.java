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
public class AdminDTO {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(length = 60, nullable = false)
    private String username;
    
    @Column(name = "user_password", nullable = false)
    private String password;
    
    @Column(length = 100, nullable = false)
    private String email;
    
    @Column(length = 100, nullable = false)
    private String fullname;
}
