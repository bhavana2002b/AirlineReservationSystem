package com.demo.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.demo.Entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer>
{
	
@Query("select i from Admin i where i.Adminid=?1")
List<Admin> getInstructorByAdminId(String adminid);
	
@Query("select i from Admin i where i.Username=:username")	
Admin	getAdminByType(@Param("Username") String username);

@Query("select i from Admin i where i.Password=:password")	
Admin	getAdminByPassword(@Param("password") String password);

@Query("select i from Admin i where i.Email=:email")	
Admin	getAdminByEmail(@Param("email") String email);

@Query("select i from Admin i where i.Fullname=:Fullname")	
Admin	getAdminByfullname(@Param("fullname") String fullname);


//for testing purpose
Optional<Admin> findByadminid(String id);
}
