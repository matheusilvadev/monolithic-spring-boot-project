package com.gprmono.gpr.services;

import com.gprmono.gpr.model.Client;
import com.gprmono.gpr.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> listAll(){
        return clientRepository.findAll();
    }

    public Optional<Client> findById(Long id){
        return clientRepository.findById(id);
    }

    public Client save(Client client){
        return clientRepository.save(client);
    }

    public void delete(Long id){
        clientRepository.deleteById(id);
    }
}
