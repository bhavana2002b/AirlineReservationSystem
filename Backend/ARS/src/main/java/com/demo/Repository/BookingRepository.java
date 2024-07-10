package com.demo.Repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.demo.Entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer>{
	
@Query("select i from Booking i where i.booking_id=?1")
List<Booking> getBookingByBooking_Id(String booking_id);
	
@Query("select i from Booking i where i.type=:type")	
Booking	getBookingByType(@Param("Type") String type);

@Query("select i from Booking i where i.date=:date")	
Booking	getBookingByDate(@Param("date") String date);

@Query("select i from Booking i where i.user.id=:userid")	
Booking	getBookingByuserid(@Param("userid") String userid);

//for testing purpose
Optional<Booking> findBybookingid(String id);
}
