package ru.orbitel.server.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.orbitel.server.model.ClientContract;
import ru.orbitel.server.service.ClientContractService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequiredArgsConstructor
@RequestMapping("/orbitel")
public class ClientContractController {
    private final ClientContractService clientContractService;

    @GetMapping("/client-contract")
    public ResponseEntity<List<ClientContract>> getAllClientContracts() {
        return clientContractService.getAllClientContracts();
    }

}
