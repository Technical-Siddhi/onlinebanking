package com.naukri.onlinebanking.repository;

import com.naukri.onlinebanking.dto.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<Email, Integer> {
}
