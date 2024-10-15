package ru.orbitel.server.mapper;

import org.springframework.jdbc.core.RowMapper;
import ru.orbitel.server.model.Tariff;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TariffRowMapper implements RowMapper<Tariff> {
    public Tariff mapRow(ResultSet rs, int rowNum) throws SQLException {
        Tariff tariff = new Tariff();
        tariff.setTariffId(rs.getLong("tariff_id"));
        tariff.setTariffName(rs.getString("tariff_name"));
        tariff.setPricePerMonth(rs.getBigDecimal("price_per_month"));
        tariff.setSpeed(rs.getString("speed"));
        return tariff;
    }
}
