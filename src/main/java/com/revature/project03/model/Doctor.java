package com.revature.project03.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Doctor_Table")
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Doctor {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int doctorId;
private String firstName;
private String lastName;
private String email;
private long phno;
private int fees;
private String designation;
private String specialization;
@Embedded
private DoctorAvailability doctorAvailability;
private String password;


}