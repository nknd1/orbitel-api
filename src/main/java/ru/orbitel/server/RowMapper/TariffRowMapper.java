package ru.orbitel.server.RowMapper;

import org.springframework.jdbc.core.RowMapper;
import ru.orbitel.server.model.Tariff;

public class TariffRowMapper {
}/*
    RowMapper<Tariff> tariffRowMapper = (rs, rowNum) ->
            new Tariff(
                    rs.getLong("tariff_id"),
                    rs.getString("tariff_name"),
                    rs.getInt("price_per_month"),
                    rs.getString("speed"));
}


 */