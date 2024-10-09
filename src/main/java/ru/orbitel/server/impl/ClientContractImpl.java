package ru.orbitel.server.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import ru.orbitel.server.model.ClientContract;
import ru.orbitel.server.repository.ClientContractRepository;

import java.sql.ResultSet;
import java.sql.SQLException;
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

    private static class ClientContractRowMapper implements RowMapper<ClientContract> {
        @Override
        public ClientContract mapRow(ResultSet rs, int rowNum) throws SQLException {
            ClientContract clientContract = new ClientContract();
            clientContract.setClientId(rs.getLong("client_id"));
            clientContract.setContractId(rs.getLong("contract_id"));
            // Установите другие поля
            return clientContract;
        }
    }
}
