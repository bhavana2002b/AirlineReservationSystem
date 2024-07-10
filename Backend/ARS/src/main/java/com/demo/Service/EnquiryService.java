package com.demo.Service;


import java.util.List;


import com.demo.Entity.Enquiry;
import com.demo.Model.EnquiryDTO;

public interface EnquiryService {
public String createEnquiry(Enquiry Enquiry);
public String deleteEnquiry(int id);
public EnquiryDTO updateEnquiry(int id,Enquiry enquiry);
public List<EnquiryDTO> getAllEnquirys();
public EnquiryDTO getEnquiryByTitle(String title);
public EnquiryDTO getEnquiryByType(String type);
public EnquiryDTO getEnquiryByDate(String date);
public EnquiryDTO updateEnquiryByDate(String date,Enquiry enquiry);
public EnquiryDTO getEnquiryById(int id); 
public Enquiry assignEnquiry(int bookId, int aId);
public EnquiryDTO getEnquiryByUser_Id(String user_id);
}



