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

import com.demo.Entity.Flight;
import com.demo.Model.FlightDTO;
import com.demo.Service.FlightService;
import com.demo.Util.Converter;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:8080")
public class FlightController 
{
	
	@Autowired
	FlightService flightService;
	
	@Autowired
	Converter converter;
	
	@PostMapping("/createFlight")
	public String createFlight(@RequestBody FlightDTO flightDTO)
	{
		final Flight flight = converter.covertToFlightEntity(flightDTO);
		return flightService.createFlight(flight);
	}

	@DeleteMapping("/deleteflight/{id}")
	public String deleteFlight(@PathVariable("id") int id)
	{
		return flightService.deleteFlight(id);
	}
	
	@PutMapping("/updateFlight/{id}")
	public ResponseEntity<FlightDTO> updateFlight(@PathVariable ("id") int id, @RequestBody FlightDTO flightDTO)
	{
		final Flight flight = converter.covertToFlightEntity(flightDTO);
		return new ResponseEntity<FlightDTO>(flightService.updateFlight(id, flight), HttpStatus.OK);
	}
	
	@GetMapping("/getflightById/{id}")
	public FlightDTO getFlightById(@PathVariable("id") int id)
	{
		return flightService.getFlightById(id);
	}
	
	//assign Booking to Admin
    @PostMapping("/assignflight/{bookId}/{aId}")
    public ResponseEntity<Flight> assignFlight(@PathVariable("bookId") int bookId, @PathVariable("aId") int aId)
	{
		return new ResponseEntity<Flight>(flightService.assignFlight(bookId, aId), HttpStatus.CREATED);
	}
		
	@GetMapping("/getAllFlights")
	public List<FlightDTO> getAllflights()
	{
		return flightService.getAllFlights();
	}
		
	@GetMapping("/getFlightByFlightNumber/{flightnumber}")
	public ResponseEntity<FlightDTO> getFlightByFlightNumber(@PathVariable("flightnumber") String flightnumber)
	{
		return new ResponseEntity<FlightDTO>(flightService.getFlightByflightnumber(flightnumber), HttpStatus.OK);
	}	
	
	@GetMapping("/getFlightByDepartureAirport/{departureairport}")
	public ResponseEntity<FlightDTO> getFlightByDepartureAirport(@PathVariable("departureairport") String departureairport)
	{
		return new ResponseEntity<FlightDTO>(flightService.getFlightByDepartureAirport(departureairport), HttpStatus.OK);
	}	
	
	@GetMapping("/getFlightByDestinationAirport/{destinationairport}")
	public ResponseEntity<FlightDTO> getFlightByDestinationAirport(@PathVariable("destinationairport") String destinationairport)
	{
		return new ResponseEntity<FlightDTO>(flightService.getFlightByDestinationairport(destinationairport), HttpStatus.OK);
	}	
	
	@GetMapping("/getFlightByDepartureDatetime/{departuredatetime}")
	public ResponseEntity<FlightDTO> getFlightByDepartureDatetime(@PathVariable("deaparturedatetime") String departuredatetime)
	{
		return new ResponseEntity<FlightDTO>(flightService.getFlightByDepartureDatetime(departuredatetime), HttpStatus.OK);
	}	
	
	@GetMapping("/getFlightByArrivalDatetime/{arrivaldatetime}")
	public ResponseEntity<FlightDTO> getFlightByArrivalDatetime(@PathVariable("arrivaldatetime") String arrivaldatetime)
	{
		return new ResponseEntity<FlightDTO>(flightService.getFlightByArrivalDatetime(arrivaldatetime), HttpStatus.OK);
	}	
	
	@GetMapping("/getFlightByTotalseats/{totalseats}")
	public ResponseEntity<FlightDTO> getFlightByTotalSeats(@PathVariable("totalseats") String totalseats)
	{
		return new ResponseEntity<FlightDTO>(flightService.getFlightByTotalSeats(totalseats), HttpStatus.OK);
	}	
	
	@GetMapping("/getFlightByAvailableSeats/{availableseats}")
	public ResponseEntity<FlightDTO> getFlightByAvailableSeats(@PathVariable("availableseats") String availableseats)
	{
		return new ResponseEntity<FlightDTO>(flightService.getFlightByAvailableSeats(availableseats), HttpStatus.OK);
	}	
	
	@GetMapping("/getFlightByTicketPricee/{ticketprice}")
	public ResponseEntity<FlightDTO> getFlightByTicketPrice(@PathVariable("ticketprice") String ticketprice)
	{
		return new ResponseEntity<FlightDTO>(flightService.getFlightByTicketPrice(ticketprice), HttpStatus.OK);
	}	
	
}
