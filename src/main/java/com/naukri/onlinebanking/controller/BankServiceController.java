package com.naukri.onlinebanking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/bankTransaction")
public class BankServiceController {

    @PostMapping
    public void transferBalance() {

    }


}
