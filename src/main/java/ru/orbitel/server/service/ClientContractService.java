package ru.orbitel.server.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.orbitel.server.model.ClientContract;
import ru.orbitel.server.repository.ClientContractRepository;

import java.util.List;

@Service
public class ClientContractService {
    private final ClientContractRepository clientContractRepository;

    public ClientContractService(ClientContractRepository clientContractRepository) {
        this.clientContractRepository = clientContractRepository;
    }
    @Cacheable("clientContracts")
    public ResponseEntity<List<ClientContract>> getAllClientContracts() {
        return new ResponseEntity<>(clientContractRepository.findAll(), HttpStatus.OK);
    }
}
