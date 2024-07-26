package com.naukri.onlinebanking.controller;

import com.naukri.onlinebanking.dto.Client;
import com.naukri.onlinebanking.service.ClientService;
import com.naukri.onlinebanking.service.PhoneService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    public static final Logger logger = LogManager.getLogger(ClientController.class);
    @Autowired
    ClientService clientService;

    @Autowired
    PhoneService phoneService;

    @PostMapping(value = "/create", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Client> createClient(@RequestBody Client client) {

        logger.info("inside create client API");

        logger.info("create new client with data {} : ", client);

        Client client1 = clientService.saveClient(client);
        return ResponseEntity.ok(client1);
    }

    @PostMapping(value = "/addPhone/{id}", consumes = "application/json")
    public ResponseEntity<String> addPhone(@PathVariable(value = "id") Integer clientId, @RequestBody Integer phoneNumber) {
        logger.info("Inside add phone method");
        logger.info("create new phone with data {} {} : ", phoneNumber, clientId);

        phoneService.savePhone(clientId, phoneNumber);

        return  ResponseEntity.ok().body("Phone added");
    }
    @GetMapping("/showClient")
    public ResponseEntity<String> getAllClient() {

        logger.info("inside create client API");
        clientService.getAllClient();
        return ResponseEntity.ok("request is successful");
    }

    @GetMapping("/showClient/{id}")
    public ResponseEntity<String> getClient(@PathVariable(name = "id") Integer id) {

        logger.info("inside create client API");
        clientService.getClientById(id);
        return ResponseEntity.ok("request is successful");
    }

}
