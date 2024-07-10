package com.demo.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Entity.Payment;
import com.demo.Model.PaymentDTO;
import com.demo.Service.PaymentService;
import com.demo.Util.Converter;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class PaymentController {
	
	@Autowired
	PaymentService paymentService;
	
	@Autowired
	Converter converter;
	
	@PostMapping("/createPayment")
	public String createPayment(@RequestBody PaymentDTO paymentDTO)
	{
		final Payment payment = converter.covertToPaymentEntity(paymentDTO);
		return paymentService.createPayment(payment);
	}

	@DeleteMapping("/deletepayment/{id}")
	public String deletePayment(@PathVariable("id") int id)
	{
		return paymentService.deletePayment(id);
	}
	
	@PutMapping("/updatePayment/{id}")
	public ResponseEntity<PaymentDTO> updatePayment(@PathVariable ("id") int id, @RequestBody PaymentDTO paymentDTO)
	{
		final Payment payment = converter.covertToPaymentEntity(paymentDTO);
		return new ResponseEntity<PaymentDTO>(paymentService.updatePayment(id, payment), HttpStatus.OK);
	}
	
	@GetMapping("/getPaymentById/{id}")
	public PaymentDTO getPaymentById(@PathVariable("id") int id)
	{
		return paymentService.getPaymentByPaymentId(id);
	}
		
	//assign Booking to Admin
	@PostMapping("/assignPayment/{bookId}/{aId}")
	public ResponseEntity<Payment> assignPayment(@PathVariable("bookId") int bookId, @PathVariable("aId") int aId)
	{
		return new ResponseEntity<Payment>(paymentService.assignPayment(bookId, aId), HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllPayments")
	public List<PaymentDTO> getAllpayments()
	{
		return paymentService.getAllPayments();
	}
	
	@GetMapping("/getPaymentByBooking_Id/{booking_id}")
	public ResponseEntity<PaymentDTO> getPaymentByBooking_Id(@PathVariable("booking_id") String booking_id)
	{
		return new ResponseEntity<PaymentDTO>(paymentService.getPaymentByBooking_Id(booking_id), HttpStatus.OK);
	}	
	
	@GetMapping("/getPaymentByDate/{date}")
	public ResponseEntity<PaymentDTO> getPaymentByDate(@PathVariable("date") String date)
	{
		return new ResponseEntity<PaymentDTO>(paymentService.getBydate(date), HttpStatus.OK);
	}	
	
	@GetMapping("/getPaymentByAmount/{amount}")
	public ResponseEntity<PaymentDTO> getPaymentByAmount(@PathVariable("amount") String amount)
	{
		return new ResponseEntity<PaymentDTO>(paymentService.getByamount(amount), HttpStatus.OK);
	}	
	
	@GetMapping("/getPaymentByStatus/{status}")
	public ResponseEntity<PaymentDTO> getPaymentByStatus(@PathVariable("status") String status)
	{
		return new ResponseEntity<PaymentDTO>(paymentService.getBystatus(status), HttpStatus.OK);
	}	
}
