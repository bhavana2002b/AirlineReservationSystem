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


import com.demo.Entity.User;
import com.demo.Model.UserDTO;
import com.demo.Service.UserService;
import com.demo.Util.Converter;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:8080")
public class UserController {
	
	@Autowired
	UserService UserService;
	
	@Autowired
	Converter converter;
	
	@PostMapping("/createUser")
	public String createUser(@RequestBody UserDTO userDTO)
	{
		final User user = converter.covertToUserEntity(userDTO);
		return UserService.createUser(user);
	}

	@DeleteMapping("/deleteuser/{id}")
	public String deleteUser(@PathVariable("id") int id)
	{
		return UserService.deleteUser(id);
	}
	
	@PutMapping("/updateUser/{id}")
	public ResponseEntity<UserDTO> updateUser(@PathVariable ("id") int id, @RequestBody UserDTO userDTO)
	{
		final User user = converter.covertToUserEntity(userDTO);
		return new ResponseEntity<UserDTO>(UserService.updateUser(id, user), HttpStatus.OK);
	}
	
	@GetMapping("/getUserById/{id}")
	public UserDTO getUserById(@PathVariable("id") int id)
	{
		return UserService.getUserById(id);
	}
		
	//assign Booking to Admin
	@PostMapping("/assignUser/{bookId}/{aId}")
	public ResponseEntity<User> assignUser(@PathVariable("bookId") int bookId, @PathVariable("aId") int aId)
	{
		return new ResponseEntity<User>(UserService.assignUser(bookId, aId), HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllUsers")
	public List<UserDTO> getAllusers()
	{
		return UserService.getAllUsers();
	}
	
	@GetMapping("/getUserByUser_Id/{user_id}")
	public ResponseEntity<UserDTO> getUserByUser_Id(@PathVariable("user_id") String user_id)
	{
		return new ResponseEntity<UserDTO>(UserService.getUserByUser_Id(user_id), HttpStatus.OK);
	}	
	
	@GetMapping("/getUserByName/{name}")
	public ResponseEntity<UserDTO> getUserByName(@PathVariable("name") String name)
	{
		return new ResponseEntity<UserDTO>(UserService. getUserByName(name), HttpStatus.OK);
	}	
	
	@GetMapping("/getUserByMobileNo/{mobileno}")
	public ResponseEntity<UserDTO> getUserByMobileNo(@PathVariable("mobileno") String mobileno)
	{
		return new ResponseEntity<UserDTO>(UserService.getUserByMobileNo(mobileno), HttpStatus.OK);
	}	
	
	@GetMapping("/getUserByEmailId/{emailid}")
	public ResponseEntity<UserDTO> getUserByEmailId(@PathVariable("emailid") String emailid)
	{
		return new ResponseEntity<UserDTO>(UserService.getUserByEmailId(emailid), HttpStatus.OK);
	}	
	
	@GetMapping("/getUserByAddress/{address}")
	public ResponseEntity<UserDTO> getUserByAddress(@PathVariable("address") String address)
	{
		return new ResponseEntity<UserDTO>(UserService.getUserByAddress(address), HttpStatus.OK);
	}
	
	
}
