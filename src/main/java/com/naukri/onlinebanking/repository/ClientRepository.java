package com.naukri.onlinebanking.repository;

import com.naukri.onlinebanking.dto.Client;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ClientRepository extends JpaRepository<Client, Integer> {

}
