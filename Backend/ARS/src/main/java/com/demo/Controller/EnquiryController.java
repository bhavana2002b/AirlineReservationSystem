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

import com.demo.Entity.Enquiry;
import com.demo.Model.EnquiryDTO;
import com.demo.Service.EnquiryService;
import com.demo.Util.Converter;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class EnquiryController 
{
	
	@Autowired
	EnquiryService enquiryService;
	
	@Autowired
	Converter converter;
	
	@PostMapping("/createEnquiry")
	public String createEnquiry(@RequestBody EnquiryDTO enquiryDTO)
	{
		final Enquiry enquiry = converter.covertToEnquiryEntity(enquiryDTO);
		return enquiryService.createEnquiry(enquiry);
	}

	@DeleteMapping("/deleteEnquiry/{id}")
	public String deleteEnquiry(@PathVariable("id") int id)
	{
		return enquiryService.deleteEnquiry(id);
	}
	
	@PutMapping("/updateEnquiry/{id}")
	public ResponseEntity<EnquiryDTO> updateEnquiry(@PathVariable ("id") int id, @RequestBody EnquiryDTO enquiryDTO)
	{
		final Enquiry enquiry = converter.covertToEnquiryEntity(enquiryDTO);
		return new ResponseEntity<EnquiryDTO>(enquiryService.updateEnquiry(id, enquiry), HttpStatus.OK);
	}
	
	@GetMapping("/getEnquiryById/{id}")
	public EnquiryDTO getEnquiryById(@PathVariable("id") int id)
	{
		return enquiryService.getEnquiryById(id);
	}
		
	//assign Booking to Admin
		@PostMapping("/assignEnquiry/{bookId}/{aId}")
		public ResponseEntity<Enquiry> assignEnquiry(@PathVariable("bookId") int bookId, @PathVariable("aId") int aId)
		{
			return new ResponseEntity<Enquiry>(enquiryService.assignEnquiry(bookId, aId), HttpStatus.CREATED);
		}
		
		@GetMapping("/getAllEnquirys")
		public List<EnquiryDTO> getAllenquirys()
		{
			return enquiryService.getAllEnquirys();
		}
		
		@GetMapping("/getEnquiryByTitle/{title}")
		public ResponseEntity<EnquiryDTO> getEnquiryByTitle(@PathVariable("title") String title)
		{
			return new ResponseEntity<EnquiryDTO>(enquiryService.getEnquiryByTitle(title), HttpStatus.OK);
		}	
		
		@GetMapping("/getEnquiryBytype/{type}")
		public ResponseEntity<EnquiryDTO> getEnquiryByType(@PathVariable("type") String type)
		{
			return new ResponseEntity<EnquiryDTO>(enquiryService.getEnquiryByType(type), HttpStatus.OK);
		}	
		
		@GetMapping("/getEnquiryBydate/{date}")
		public ResponseEntity<EnquiryDTO> getEnquiryByDate(@PathVariable("date") String date)
		{
			return new ResponseEntity<EnquiryDTO>(enquiryService.getEnquiryByDate(date), HttpStatus.OK);
		}	
		
		@GetMapping("/getEnquiryByUser_id/{user_id}")
		public ResponseEntity<EnquiryDTO> getEnquiryByUser_Id(@PathVariable("user_id") String user_id)
		{
			return new ResponseEntity<EnquiryDTO>(enquiryService.getEnquiryByUser_Id(user_id), HttpStatus.OK);
		}	
	}
