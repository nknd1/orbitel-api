package ru.orbitel.server.mapper;


import org.springframework.jdbc.core.RowMapper;
import ru.orbitel.server.model.ClientContract;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ClientContractRowMapper implements RowMapper<ClientContract> {
    public ClientContract mapRow(ResultSet rs, int rowNum) throws SQLException {
        ClientContract clientContract = new ClientContract();
        clientContract.setClientId(rs.getLong("client_id"));
        clientContract.setContractId(rs.getLong("contract_id"));
        // Установите другие поля
        return clientContract;
    }
}
