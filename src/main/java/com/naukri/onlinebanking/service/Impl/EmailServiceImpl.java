package com.naukri.onlinebanking.service.Impl;

import com.naukri.onlinebanking.dto.Client;
import com.naukri.onlinebanking.dto.Email;
import com.naukri.onlinebanking.dto.Phone;
import com.naukri.onlinebanking.repository.ClientRepository;
import com.naukri.onlinebanking.repository.EmailRepository;
import com.naukri.onlinebanking.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    EmailRepository emailRepository;

    @Autowired
    ClientRepository clientRepository;

    public void saveEmail(int clientId, String email) {
        Client client = clientRepository.findById(clientId).orElseThrow();
        Email emailEntity = new Email();
        emailEntity.setEmail(email);
        emailEntity.setClient(client);
        emailRepository.save(emailEntity);
        client.getEmails().add(emailEntity);
        clientRepository.save(client);
    }
}
