package com.demo.Service;


import java.util.List;



import com.demo.Entity.Booking;
import com.demo.Model.BookingDTO;

public interface BookingService {
	
public String createBooking(Booking booking);
public String deleteBooking(int id);
public BookingDTO updateBooking(int id,Booking booking);
public BookingDTO getBookingById(int id);
public List<BookingDTO> getAllBookings();
public BookingDTO getBookingByType(String type);
public BookingDTO getBookingByDate(String date);
public BookingDTO updateInsByDate(String date,Booking booking);
public Booking assignBooking(int bookId, int aId);
public BookingDTO getByTitle(String title);
public BookingDTO getByDate(String date);
public BookingDTO getBookingByUser_Id(String user_id);
}
