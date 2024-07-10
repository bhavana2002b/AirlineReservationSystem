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
public class Payment {

		    @Id
		    @GeneratedValue(strategy = GenerationType.IDENTITY)
		    @Column(name="PaymentId",length= 20)
		    private Long paymentId;

		    @ManyToOne
		    @JoinColumn(name = "bookingId")
		    @Column(name="booking",length= 20)
		    private Booking booking;

		    @ManyToOne
		    @Column(name="Paymentdate",length= 20)
		    private LocalDate paymentDate;
		    @Column(name="PaymentAmount",length= 20)
		    private Double paymentAmount;
		    @Column(name="Paymentstatus",length= 20)
		    private String paymentStatus;
		   
}
		
