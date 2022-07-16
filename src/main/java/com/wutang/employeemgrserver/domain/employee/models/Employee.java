package com.wutang.employeemgrserver.domain.employee.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data // Getters And Setters
@NoArgsConstructor // Create our default constructor
@RequiredArgsConstructor // Create our parameterized constructor
@Entity // Gives Spring JPA the permission to save this object
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String firstName;

    @NonNull
    private String lastName;

    @NonNull
    private String email;

    public String toString(){
        return String.format("%d %s %s %s",id, firstName, lastName, email);
    }
}
