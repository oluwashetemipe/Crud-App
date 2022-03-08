package com.example.eagleeye.service;

import com.example.eagleeye.data.Staff;
import com.example.eagleeye.data.StaffRepository;
import com.example.eagleeye.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {

    @Autowired
    private StaffRepository staffRepository;


    //create staff
    public int createStaff(Staff staff){
        staffRepository.save(staff);
        return staff.getId();
    }

    private Boolean checkIfStaffExist(int id){
      return staffRepository.existsById(id);
    }
    //get staff by id

    public Staff getStaff(int id) throws ResourceNotFoundException {
      if (checkIfStaffExist(id)){
          return staffRepository.findById(id).get();
      }
      else {
          throw new ResourceNotFoundException("Staff with id" + id + "does not exist");
      }

    }

    //delete staff by id
    public void deleteStaff(int id) throws ResourceNotFoundException {
        staffRepository.deleteById(id);
    }

    //returns a list of staff in database
    public List<Staff> allStaff(){
        return staffRepository.findAll();
    }

    public void updateStaff(int id,Staff staffDetails) throws ResourceNotFoundException {
        Staff updateDetails = getStaff(id);
        updateDetails.setName(staffDetails.getName());
        updateDetails.setPhoneNumber(staffDetails.getPhoneNumber());
        updateDetails.setGender(staffDetails.getGender());
        updateDetails.setDateOfBirth(staffDetails.getDateOfBirth());
        staffRepository.save(updateDetails);
    }
}
