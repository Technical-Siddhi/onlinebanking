package com.naukri.onlinebanking.dto;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "phone")
public class Phone {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int phoneNumber;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
}
