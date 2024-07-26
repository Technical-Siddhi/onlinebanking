package com.naukri.onlinebanking.service;

import com.naukri.onlinebanking.dto.Client;

import java.util.List;


public interface ClientService {

    public Client saveClient(Client client);
    public List<Client> getAllClient();
    public Client getClientById(int id);
}
