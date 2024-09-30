package ru.orbitel.server.model.impl;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import ru.orbitel.server.RowMapper.TariffRowMapper;
import ru.orbitel.server.model.Tariff;
import ru.orbitel.server.repository.TariffRepository;

import java.util.List;

@Repository
public class TariffImpl implements TariffRepository {


   private final JdbcTemplate jdbcTemplate;

    public TariffImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }



    RowMapper<Tariff> tariffRowMapper = (rs, rowNum) ->
         new Tariff(
                rs.getLong("tariff_id"),
                rs.getString("tariff_name"),
                rs.getInt("price_per_month"),
                rs.getString("speed"));


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
        return jdbcTemplate.query(sql, tariffRowMapper);

    }

    @Override
    public int deleteAll() {
        return 0;
    }

}
