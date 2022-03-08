package com.example.eagleeye.service;

import com.example.eagleeye.exception.ResourceNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class StaffServiceTest {

    @Autowired
    StaffService staffService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void createStaff() {
    }

    @Test
    void getStaff() {
    }


    @Test
    void deleteStaff() throws ResourceNotFoundException {
        staffService.getStaff(1);
    }

    @Test
    void allStaff() {
    }
}