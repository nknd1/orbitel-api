package ru.orbitel.server.model.impl;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.orbitel.server.model.Tariff;
import ru.orbitel.server.repository.TariffRepository;

import java.util.List;

@Repository
public class TariffImpl implements TariffRepository {


   private final JdbcTemplate jdbcTemplate;

    public TariffImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int save(Tariff tariff) {
        return jdbcTemplate.update("INSERT INTO tariffs (tariff_name, price_per_month, speed ) VALUES (?,?,?)",
                tariff.getTariffName(),
                tariff.getPricePerMonth(),
                tariff.getSpeed());
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
        return List.of();
    }

    @Override
    public List<Tariff> findAll(Tariff tariff) {
        return jdbcTemplate.queryForList("SELECT * FROM tariffs", Tariff.class);
    }

    @Override
    public int deleteAll() {
        return 0;
    }

}
