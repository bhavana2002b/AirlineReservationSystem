package com.demo.Service;


import java.util.List;


import com.demo.Entity.Admin;
import com.demo.Model.AdminDTO;

public interface AdminService {
	public String createAdmin(Admin admin);
	public String deleteAdmin(int id);
	public AdminDTO updateAdmin(int id,Admin admin);
	public AdminDTO getAdminById (int id);
	Admin assignBooking(int BookingId,int AdminId);
	List<AdminDTO> getAllAdmin();
	AdminDTO getByTitle(String name);
	public AdminDTO getByUsername(String username);
	public AdminDTO getByPassword(String password);
	public Admin assignAdmin(int bookId, int aId);
	
}
