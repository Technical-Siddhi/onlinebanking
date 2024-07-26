package com.naukri.onlinebanking.dto;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "email")
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
}
