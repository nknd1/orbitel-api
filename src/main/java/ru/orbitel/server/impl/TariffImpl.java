package ru.orbitel.server.impl;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.orbitel.server.mapper.TariffRowMapper;
import ru.orbitel.server.model.Tariff;
import ru.orbitel.server.repository.TariffRepository;
import java.util.List;

@Component
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

}
