package com.demo.Service;
import java.util.List;


import com.demo.Entity.Flight;
import com.demo.Model.FlightDTO;

public interface FlightService {
public String createFlight(Flight flight);
public String deleteFlight(int id);
public FlightDTO updateFlight(int id,Flight flight);
public List<FlightDTO> getAllFlights();
public FlightDTO getFlightByflightnumber(String flightnumber);
public FlightDTO getFlightByDepartureAirport(String departureairport);
public FlightDTO getFlightByDestinationairport(String destinationairport);
public FlightDTO getFlightByDepartureDatetime(String departuredatetime);
public FlightDTO getFlightByArrivalDatetime(String arrivaldatetime);
public FlightDTO getFlightByTotalSeats(String totalseats);
public FlightDTO getFlightByAvailableSeats(String availableseats);
public FlightDTO getFlightByTicketPrice(String ticketprice);
public FlightDTO getFlightByDate(String date);
public FlightDTO updateInsByDate(String date,Flight flight);
public FlightDTO getFlightBynumber(String number);
public FlightDTO getFlightBydestinationsirport(String destinationairport);
public FlightDTO getFlightByArrivaldatetime(String arrivaldatetime);
public FlightDTO getFlightById(int id); 
public Flight assignFlight(int bookId, int aId);



	
}
