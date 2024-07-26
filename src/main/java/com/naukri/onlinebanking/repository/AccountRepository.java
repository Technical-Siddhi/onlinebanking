package com.naukri.onlinebanking.repository;

import com.naukri.onlinebanking.dto.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {
}
