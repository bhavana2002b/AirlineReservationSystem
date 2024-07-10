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
public class PaymentDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer paymentid;

    @ManyToOne
    @JoinColumn(name = "bookingid")
    @JsonIgnoreProperties("payments")
    private BookingDTO booking;

    @Column
    private String paymentdate;

    @Column
    private Double paymentamount;

    @Column(length = 30)
    private String paymentstatus;
}
