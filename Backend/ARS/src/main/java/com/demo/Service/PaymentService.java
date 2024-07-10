package com.demo.Service;

import java.util.List;


import com.demo.Entity.Payment;
import com.demo.Model.PaymentDTO;

public interface PaymentService {
public String createPayment(Payment payment);
public String deletePayment(int id);
public PaymentDTO updatePayment(int Paymentid,Payment payment);
public PaymentDTO getPaymentByPaymentId(int paymentid);
public List<PaymentDTO> getAllPayments();
public PaymentDTO getPaymentByBooking_Id(String booking_id);
public List<PaymentDTO> getPaymentByPaymentDate(String paymentdate);
public List<PaymentDTO> getPaymentByPaymentAmount(String paymentamount);
public PaymentDTO getPaymentByPaymentStatus(String paymentstatus);
public PaymentDTO updatePaymentBypaymentstatus(String paymentstatus,Payment payment);
public Payment assignPayment(int bookId, int aId);
public PaymentDTO getBydate(String date);
public PaymentDTO getByamount(String amount);
public PaymentDTO getBystatus(String status);

}
