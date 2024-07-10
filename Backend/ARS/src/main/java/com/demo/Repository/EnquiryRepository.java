package com.demo.Repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.demo.Entity.Enquiry;


public interface EnquiryRepository extends JpaRepository<Enquiry, Integer>{
	
@Query("select i from Enquiry i where i.id=?1")
List<Enquiry> getEnquiryById(String id);
	
@Query("select i from Enquiry i where i.title=:title")	
Enquiry	getEnquiryByTitle(@Param("Title") String title);

@Query("select i from Enquiry i where i.type=:type")	
Enquiry	getEnquiryByType(@Param("Type") String type);

@Query("select i from Enquiry i where i.Date=:date")	
Enquiry	getEnquiryByDate(@Param("date") String date);

//for testing purpose
Optional<Enquiry> findByFirstName(String name);
}
