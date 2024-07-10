package com.demo.Repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.demo.Entity.Flight;


public interface FlightRepository extends JpaRepository<Flight, Integer>{
	
@Query("select i from Flight i where i.id=?1")
List<Flight> getFlightById(String id);
	
@Query("select i from Flight i where i.FlightNumber=:flightnumber")	
Flight	getFlightrByFlightNumber(@Param("FlightNumber") String flightnumber);

@Query("select i from Flight i where i.DepartureAirport=:departureairport")	
Flight	getFlightByDepartureAirport(@Param("DepartureAirport") String departureairport);

@Query("select i from Flight i where i.DestinationAirport=:destinationairport")	
Flight	getFlightByDestinationAirport(@Param("destinationairport") String destinationairport);

@Query("select i from Flight i where i.DepartureDatetime=:departuredatetime")	
Flight	getFlightByDeparturedatetime(@Param("departuredatetime") String departuredatetime);

@Query("select i from Flight i where i.ArrivalDatetime=:arrivaldatetime")	
Flight	getFlightByArrivaldatetime(@Param("arrivaldatetime") String arrivaldatetime);

@Query("select i from Flight i where i.TotalSeats=:totalseats")	
Flight	getFlightByTotalSeats(@Param("totalseats") String totalseats);

@Query("select i from Flight i where AvailableSeats=:availableseats")	
Flight	getFlightByAvailbaleSeats(@Param("availableseats") String availableseats);

@Query("select i from Flight i where i.TicketPrice=:ticketprice")	
Flight	getFlightByTicketPrice(@Param("ticketprice") String ticketprice);

//for testing purpose
Optional<Flight> findByid(String id);
}
