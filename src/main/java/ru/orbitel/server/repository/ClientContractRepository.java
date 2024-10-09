package ru.orbitel.server.repository;

import org.springframework.stereotype.Repository;
import ru.orbitel.server.model.ClientContract;
import java.util.List;

@Repository
public interface ClientContractRepository {
    void save(ClientContract clientContract);

    List<ClientContract> findAll();

    ClientContract findById(Long clientId, Long contractId);

    void delete(Long clientId, Long contractId);
}
