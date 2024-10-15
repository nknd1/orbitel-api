package ru.orbitel.server.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.orbitel.server.mapper.ClientContractRowMapper;
import ru.orbitel.server.model.ClientContract;
import ru.orbitel.server.repository.ClientContractRepository;

import java.util.List;

@Component
public class ClientContractImpl implements ClientContractRepository {

    private final JdbcTemplate jdbcTemplate;

    public ClientContractImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public void save(ClientContract clientContract) {

    }

    @Override
    public List<ClientContract> findAll() {
        String sql = "SELECT * FROM client_contracts";
        return jdbcTemplate.query(sql, new ClientContractRowMapper());
    }

    @Override
    public ClientContract findById(Long clientId, Long contractId) {
        return null;
    }

    @Override
    public void delete(Long clientId, Long contractId) {

    }


}
