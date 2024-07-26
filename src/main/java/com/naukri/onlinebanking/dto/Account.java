package com.naukri.onlinebanking.dto;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;


@Data
@Table(name = "account")
@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double initialBalance;
    private double currentBalance;
    private LocalDate createdDate;
    private LocalDate updatedDate;
    private String createdBy;
    private String modifiedBy;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

}
