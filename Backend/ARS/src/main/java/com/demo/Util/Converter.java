package com.demo.Util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.demo.Entity.Admin;
import com.demo.Entity.Booking;
import com.demo.Entity.Enquiry;
import com.demo.Entity.Flight;
import com.demo.Entity.Payment;
import com.demo.Entity.Ticket;
import com.demo.Entity.User;
import com.demo.Model.AdminDTO;
import com.demo.Model.BookingDTO;
import com.demo.Model.EnquiryDTO;
import com.demo.Model.FlightDTO;
import com.demo.Model.PaymentDTO;
import com.demo.Model.TicketDTO;
import com.demo.Model.UserDTO;

@Component
public class Converter 
{
	
	
	//convert from DTO  to entity
	   public Admin covertToAdminEntity(AdminDTO adminDTO)
	   {
		    Admin admin=new Admin();
		    if(admin!=null)
		    {
			     BeanUtils.copyProperties(adminDTO, admin);
		    }
		    return admin;
	   }
	
	//covert from Entity to DTO
		public AdminDTO convertToAdminDTO(Admin admin)
		{
			AdminDTO adminDTO=new AdminDTO();
			if(admin!=null)
			{
				BeanUtils.copyProperties(admin, adminDTO);
			}
			return adminDTO;
		}

	//convert from DTO  to entity
	    public Booking covertToBookingEntity(BookingDTO BookingDTO)
	    {
		    Booking booking=new Booking();
		    if(BookingDTO!=null)
		    {
			    BeanUtils.copyProperties(BookingDTO, booking);
		    }
		    return booking;
	    }
	//covert from Entity to DTO
	    public BookingDTO convertToBookingDTO(Booking booking)
	    {
		    BookingDTO bookingDTO=new BookingDTO();
		    if(booking!=null)
		    {
			    BeanUtils.copyProperties(booking, booking);
		    }
		    return bookingDTO;
	    }
	    
	//convert from DTO  to entity
	    public Enquiry covertToEnquiryEntity(EnquiryDTO EnquiryDTO)
	    {
		    Enquiry enquiry=new Enquiry();
		    if(EnquiryDTO!=null)
		    {
			    BeanUtils.copyProperties(EnquiryDTO, enquiry);
		    }
		    return enquiry;
	    }
	    
	   
	//covert from Entity to DTO
	   public EnquiryDTO convertToEnquiryDTO(Enquiry enquiry)
	   {
		    EnquiryDTO enquiryDTO=new EnquiryDTO();
		    if(enquiry!=null)
		    {
			    BeanUtils.copyProperties(enquiry, enquiry);
		    }
		    return enquiryDTO;
	   }
	   
	 //convert from DTO  to entity
	    public Flight covertToFlightEntity(FlightDTO FlightDTO)
	    {
		    Flight flight=new Flight();
		    if(FlightDTO!=null)
		    {
			    BeanUtils.copyProperties(FlightDTO, flight);
		    }
		    return flight;
	    }
	    
	   
	//covert from Entity to DTO
	   public FlightDTO convertToFlightDTO(Flight flight)
	   {
		    FlightDTO flightDTO=new FlightDTO();
		    if(flight!=null)
		    {
			    BeanUtils.copyProperties(flight, flight);
		    }
		    return flightDTO;
	   }
	   
	 //convert from DTO  to entity
	    public Payment covertToPaymentEntity(PaymentDTO PaymentDTO)
	    {
		    Payment payment=new Payment();
		    if(PaymentDTO!=null)
		    {
			    BeanUtils.copyProperties(PaymentDTO, payment);
		    }
		    return payment;
	    }
	    
	   
	//covert from Entity to DTO
	   public PaymentDTO convertToPaymentDTO(Payment payment)
	   {
		    PaymentDTO paymentDTO=new PaymentDTO();
		    if(payment!=null)
		    {
			    BeanUtils.copyProperties(payment, payment);
		    }
		    return paymentDTO;
	   }
	   
	 //convert from DTO  to entity
	    public Ticket covertToTicketEntity(TicketDTO TicketDTO)
	    {
		    Ticket ticket=new Ticket();
		    if(TicketDTO!=null)
		    {
			    BeanUtils.copyProperties(TicketDTO, ticket);
		    }
		    return ticket;
	    }
	    
	   
	//covert from Entity to DTO
	   public TicketDTO convertToTicketDTO(Ticket ticket)
	   {
		    TicketDTO ticketDTO=new TicketDTO();
		    if(ticket!=null)
		    {
			    BeanUtils.copyProperties(ticket, ticket);
		    }
		    return ticketDTO;
	   }
	   
	 //convert from DTO  to entity
	    public User covertToUserEntity(UserDTO UserDTO)
	    {
		    User user=new User();
		    if(UserDTO!=null)
		    {
			    BeanUtils.copyProperties(UserDTO, user);
		    }
		    return user;
	    }
	    
	   
	//covert from Entity to DTO
	   public UserDTO convertToUserDTO(User user)
	   {
		    UserDTO userDTO=new UserDTO();
		    if(user!=null)
		    {
			    BeanUtils.copyProperties(user, user);
		    }
		    return userDTO;
	   }
	   
	
}
