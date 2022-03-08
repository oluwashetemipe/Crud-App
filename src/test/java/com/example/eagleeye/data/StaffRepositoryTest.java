package com.example.eagleeye.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest

class StaffRepositoryTest {

    @Autowired
    StaffRepository staffRepository;

    Staff staff;
    @BeforeEach
    void setUp() {
        staff = new Staff();
    }

    @Test
    void createStaff(){
        staff.setName("Ife");
        staff.setGender("Female");
        staff.setPhoneNumber("090873454321");
        staff.setDateOfBirth("23-02-2020");
        staffRepository.save(staff);
    }
    @Test
    void findById(){
        staff = staffRepository.findById(2).get();
        System.out.println(staff);
    }
    @Test
    void findAll(){
        List<Staff> staff = staffRepository.findAll();
        System.out.println(staff);
    }
    @Test
    void deleteById(){
        staffRepository.deleteById(1);
    }
}
