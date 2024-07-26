package com.naukri.onlinebanking.service.Impl;

import com.naukri.onlinebanking.dto.Client;
import com.naukri.onlinebanking.repository.ClientRepository;
import com.naukri.onlinebanking.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository clientRepository;

    @Override
    public Client saveClient(Client client) {

        return clientRepository.save(client);
    }

    @Override
    public List<Client> getAllClient() {

        return null;
    }

    @Override
    public Client getClientById(int id) {

        return null;
    }
}
