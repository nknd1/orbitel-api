package ru.orbitel.server.service;

import org.springframework.stereotype.Service;
import ru.orbitel.server.model.Tariff;
import ru.orbitel.server.repository.TariffRepository;

import java.util.List;

@Service
public class TariffService {
    private final TariffRepository tariffRepository;

    public TariffService(TariffRepository tariffRepository) {
        this.tariffRepository = tariffRepository;
    }

    public List<Tariff> getTariffs() {
        return tariffRepository.findAll();
    }
}
