package com.naukri.onlinebanking.service.Impl;

import com.naukri.onlinebanking.repository.AccountRepository;
import com.naukri.onlinebanking.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepository accountRepository;
}
