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
public class UserDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column(length = 50, nullable = false)
    private String username;

    @Column(length = 15, nullable = false)
    private String userMobileNo;

    @Column(length = 100, nullable = false, unique = true)
    private String userEmailId;

    @Column(length = 255, nullable = true)
    private String userAddress;
    
}