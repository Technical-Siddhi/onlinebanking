package com.naukri.onlinebanking.repository;

import com.naukri.onlinebanking.dto.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<Phone, Integer> {
}
