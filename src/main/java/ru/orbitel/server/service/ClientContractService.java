package ru.orbitel.server.service;

import org.springframework.cache.annotation.Cacheable;
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
    public List<ClientContract> getAllClientContracts() {
        return clientContractRepository.findAll();
    }
}
