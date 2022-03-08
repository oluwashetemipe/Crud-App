package com.example.eagleeye.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff,Integer> {
    // all crud database methods with parameters as the object type of Jpa entity and primary key data type
}
