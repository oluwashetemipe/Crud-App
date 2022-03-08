package com.example.eagleeye.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
//creating a table in the database
public class Staff {
     // instantiating variables as columns for database
     @Id
     @GeneratedValue(strategy = GenerationType.SEQUENCE)
     //generates id automatically and makes it primary key in the table
     private int id;
     private String name;
     private String phoneNumber;
     private String gender;
     private String dateOfBirth;
}
