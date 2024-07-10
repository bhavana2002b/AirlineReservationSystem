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

import com.demo.Entity.Booking;
import com.demo.Model.BookingDTO;
import com.demo.Service.BookingService;
import com.demo.Util.Converter;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class BookingController {
	
	@Autowired
	BookingService bookingService;
	
	@Autowired
	Converter converter;
	
	@PostMapping("/createBooking")
	public String createBooking(@RequestBody BookingDTO bookingDTO)
	{
		final Booking booking = converter.covertToBookingEntity(bookingDTO);
		return bookingService.createBooking(booking);
	}

	@DeleteMapping("/deleteBooking/{id}")
	public String deleteBooking(@PathVariable("id") int id)
	{
		return bookingService.deleteBooking(id);
	}
	
	
	
	@PutMapping("/updateBooking/{id}")
	public ResponseEntity<BookingDTO> updateBooking(@PathVariable ("id") int id, @RequestBody BookingDTO bookingDTO)
	{
		final Booking booking = converter.covertToBookingEntity(bookingDTO);
		return new ResponseEntity<BookingDTO>(bookingService.updateBooking(id, booking), HttpStatus.OK);
	}
	
	
	
	@GetMapping("/getBookingById/{id}")
	public BookingDTO getBookingById(@PathVariable("id") int id)
	{
		return bookingService.getBookingById(id);
	}
		
	//assign Booking to Admin
	@PostMapping("/assignBooking/{bookId}/{aId}")
	public ResponseEntity<Booking> assignBooking(@PathVariable("bookId") int bookId, @PathVariable("aId") int aId)
	{
		return new ResponseEntity<Booking>(bookingService.assignBooking(bookId, aId), HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllAdmins")
	public List<BookingDTO> getAllBookings()
	{
		return bookingService.getAllBookings();
	}
	
	@GetMapping("/getBookingByType/{type}")
	public ResponseEntity<BookingDTO> getBookingByType(@PathVariable("type") String type)
	{
		return new ResponseEntity<BookingDTO>(bookingService.getBookingByType(type), HttpStatus.OK);
	}	
	
	@GetMapping("/getBookingByDate/{date}")
	public ResponseEntity<BookingDTO> getBookingByDate(@PathVariable("date") String date)
	{
		return new ResponseEntity<BookingDTO>(bookingService.getByDate(date), HttpStatus.OK);
	}	
	
	@GetMapping("/getBookingByUser_Id/{user_id}")
	public ResponseEntity<BookingDTO> getBookingByUser_Id(@PathVariable("user_id") String user_id)
	{
		return new ResponseEntity<BookingDTO>(bookingService.getBookingByUser_Id(user_id), HttpStatus.OK);
	}	
}
