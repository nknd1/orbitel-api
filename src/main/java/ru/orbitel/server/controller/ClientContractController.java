package ru.orbitel.server.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.orbitel.server.model.ClientContract;
import ru.orbitel.server.service.ClientContractService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/orbitel")
public class ClientContractController {
    private final ClientContractService clientContractService;

    public ClientContractController(ClientContractService clientContractService) {
        this.clientContractService = clientContractService;
    }

    @GetMapping("/client-contract")
    public List<ClientContract> getAllClientContracts() {
        return clientContractService.getAllClientContracts();
    }

}
