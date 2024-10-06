package ru.orbitel.server.model.impl;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import ru.orbitel.server.model.Tariff;
import ru.orbitel.server.repository.TariffRepository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class TariffImpl implements TariffRepository {

   private final JdbcTemplate jdbcTemplate;

    public TariffImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int save(Tariff tariff) {
        return 0;
    }

    @Override
    public int update(Tariff tariff) {
        return 0;
    }

    @Override
    public Tariff findById(Long tariffId) {
        return null;
    }

    @Override
    public int deleteById(Long tariffId) {
        return 0;
    }


    @Override
    public List<Tariff> findAll() {
        var sql = "SELECT tariff_id, tariff_name, price_per_month, speed FROM tariffs";
        return jdbcTemplate.query(sql, new TariffRowMapper());

    }

    @Override
    public int deleteAll() {
        return 0;
    }
    private static class TariffRowMapper implements RowMapper<Tariff> {
        @Override
        public Tariff mapRow(ResultSet rs, int rowNum) throws SQLException {
           Tariff tariff = new Tariff();
            tariff.setTariffId(rs.getLong("tariff_id"));
            tariff.setTariffName(rs.getString("tariff_name"));
            tariff.setPricePerMonth(rs.getBigDecimal("price_per_month"));
            tariff.setSpeed(rs.getString("speed"));
            return tariff;
        }
    }
}
