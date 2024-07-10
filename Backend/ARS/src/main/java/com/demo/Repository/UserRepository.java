package com.demo.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.demo.Entity.User;


public interface UserRepository extends JpaRepository<User, Integer>{
	
@Query("select i from User i where i.id=?1")
List<User> getUserById(String id);
	
@Query("select i from User i where i.Name=:name")	
User	getUserByName(@Param("Name") String name);

@Query("select i from User i where i.MobileNo=:mobileno")	
User	getUserByMobileNo(@Param("MobileNo") String mobileno);

@Query("select i from User i where i.EmailId=:emailid")	
User    getUserByEmailId(@Param("emailid") String emailid);

@Query("select i from User i where i.Address=:address")	
User	getUserByAddress(@Param("address") String address);


//for testing purpose
Optional<User> findByid(String id);
}
