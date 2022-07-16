package com.wutang.employeemgrserver.domain.customer.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;

    @NonNull
    private String email;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastVisit;

    @PrePersist
    protected void onCreate(){
        lastVisit = new Date();
    }

    @PreUpdate
    protected void onUpdate(){
        lastVisit = new Date();
    }
}
