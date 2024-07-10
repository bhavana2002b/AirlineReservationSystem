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

import com.demo.Entity.Admin;
import com.demo.Model.AdminDTO;
import com.demo.Service.AdminService;
import com.demo.Util.Converter;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:8080")
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@Autowired
	Converter converter;
	
	@PostMapping("/createAdmin")
	public String createAdmin (@RequestBody AdminDTO adminDTO)
	{
		final Admin admin = converter.covertToAdminEntity(adminDTO);
		return adminService.createAdmin(admin);
	}

	@DeleteMapping("/deleteAdmin/{id}")
	public String deleteAdmin(@PathVariable("id") int id)
	{
		return adminService.deleteAdmin(id);
	}
	
	
	
	@PutMapping("/updateAdmin/{id}")
	public ResponseEntity<AdminDTO> updateAdmin(@PathVariable ("id") int id, @RequestBody AdminDTO adminDTO)
	{
		final Admin admin = converter.covertToAdminEntity(adminDTO);
		return new ResponseEntity<AdminDTO>(adminService.updateAdmin(id, admin), HttpStatus.OK);
	}
	
	
	
	@GetMapping("/getAdminById/{id}")
	public AdminDTO getAdminById(@PathVariable("id") int id)
	{
		return adminService.getAdminById(id);
	}
		
	//assign Booking to Admin
	@PostMapping("/assignAdmin/{bookId}/{aId}")
	public ResponseEntity<Admin> assignAdmin(@PathVariable("bookId") int bookId, @PathVariable("aId") int aId)
	{
		return new ResponseEntity<Admin>(adminService.assignAdmin(bookId, aId), HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllAdmins")
	public List<AdminDTO> getAllAdmins()
	{
		return adminService.getAllAdmin();
	}
	
	@GetMapping("/getAdminByusername/{username}")
	public ResponseEntity<AdminDTO> getAdminByUsername(@PathVariable("username") String username)
	{
		return new ResponseEntity<AdminDTO>(adminService.getByUsername(username), HttpStatus.OK);
	}	
	
	@GetMapping("/getAdminByPassword/{password}")
	public ResponseEntity<AdminDTO> getAdminByPassword(@PathVariable("Password") String password)
	{
		return new ResponseEntity<AdminDTO>(adminService.getByPassword(password), HttpStatus.OK);
	}	
}
