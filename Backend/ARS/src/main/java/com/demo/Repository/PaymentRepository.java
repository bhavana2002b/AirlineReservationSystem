package com.demo.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.demo.Entity.Payment;


public interface PaymentRepository extends JpaRepository<Payment, Integer>{
	
@Query("select i from Payment i where i.PaymentId=?1")
List<Payment> getPaymentByPaymentId(String paymentid);
	
@Query("select i from Payment i where i.BookingId=:bookingid")	
Payment	getPaymentrByBookingId(@Param("BookingId") String bookingid);

@Query("select i from payment i where i.PaymentDate=:paymentdate")	
Payment	getPaymentByPaymentDate(@Param("PaymentDate") String paymentdate);

@Query("select i from Payment i where i.PaymentAmount=:paymentamount")	
Payment	getPaymentByPaymentAmount(@Param("paymentamount") String paymentamount);

@Query("select i from  i where i.PaymentStatus=:paymentstatus")	
Payment	getPaymentBypaymentStatus(@Param("paymentstatus") String paymentstatus);


//for testing purpose
Optional<Payment> findBypaymentid(String paymentid);
}
