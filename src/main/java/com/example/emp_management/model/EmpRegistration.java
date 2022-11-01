package com.example.emp_management.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "employee_reg")
public class EmpRegistration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String email;
    private String password;
}
