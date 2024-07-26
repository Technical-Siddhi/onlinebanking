package com.naukri.onlinebanking.service.Impl;

import com.naukri.onlinebanking.dto.Client;
import com.naukri.onlinebanking.dto.Phone;
import com.naukri.onlinebanking.repository.ClientRepository;
import com.naukri.onlinebanking.repository.PhoneRepository;
import com.naukri.onlinebanking.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneServiceImpl implements PhoneService {

    @Autowired
    PhoneRepository phoneRepository;

    @Autowired
    ClientRepository clientRepository;

    public void savePhone(int clientId, int phoneNumber) {
        Client client = clientRepository.findById(clientId).orElseThrow();
        Phone phoneEntity = new Phone();
        phoneEntity.setPhoneNumber(phoneNumber);
        phoneEntity.setClient(client);
        phoneRepository.save(phoneEntity);
        client.getPhones().add(phoneEntity);
        clientRepository.save(client);
    }
}
