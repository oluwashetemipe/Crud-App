package com.example.eagleeye.controller;

import com.example.eagleeye.data.Staff;
import com.example.eagleeye.exception.ResourceNotFoundException;
import com.example.eagleeye.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/staff")
public class StaffController {

    @Autowired
    private StaffService staffService;

    @PostMapping
    public ResponseEntity<?> createStaff(@RequestBody Staff staff){
        staffService.createStaff(staff);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteStaff(@PathVariable int id) throws ResourceNotFoundException {
        staffService.deleteStaff(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/{id}")
    public Staff getStaff(@PathVariable int id) throws ResourceNotFoundException {
        return staffService.getStaff(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Staff> updateStaff(@PathVariable int id, @RequestBody Staff staffDetails) throws ResourceNotFoundException {
         staffService.updateStaff(id,staffDetails);
         return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping
    public List<Staff> fetchAllStaff(){
        return staffService.allStaff();
    }

}
