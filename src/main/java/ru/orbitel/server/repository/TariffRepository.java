package ru.orbitel.server.repository;


import org.springframework.stereotype.Repository;
import ru.orbitel.server.model.Tariff;

import java.util.List;
@Repository
public interface TariffRepository {
    int save(Tariff tariff);

    int update(Tariff tariff);

    Tariff findById(Long tariff_id);

    int deleteById(Long tariff_id);

    List<Tariff> findAll();

    int deleteAll();
}
