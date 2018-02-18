package com.facundoprecentado.controller;

import com.facundoprecentado.domain.Client;
import com.facundoprecentado.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping
    @ResponseBody
    public Iterable<Client> getClients() {
        return clientRepository.findAll();
    }

    @PostMapping
    @ResponseBody
    public Client createClient(Client client) {
        Client newClient = new Client();

        newClient.setFirstname(client.getFirstname());
        newClient.setLastname(client.getLastname());

        clientRepository.save(newClient);

        return newClient;
    }

}
