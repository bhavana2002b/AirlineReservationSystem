package com.demo.Service;


import java.util.List;

import com.demo.Entity.User;
import com.demo.Model.UserDTO;

public interface UserService {
public String createUser(User user);
public String deleteUser(int id);
public UserDTO updateUser(int id,User user);
public List<UserDTO> getAllUsers();
public UserDTO getUserById(String id);
public UserDTO getUserByUser_Id(String user_id);
public UserDTO getUserByName(String name);
public UserDTO getUserByMobileNo(String mobileno);
public UserDTO getUserByEmailId(String emailid);
public UserDTO getUserByAddress(String address);
public UserDTO updateUserByAddress(String address,User user);
public UserDTO getUserById(int id); 
public User assignUser(int bookId, int aId);




}
