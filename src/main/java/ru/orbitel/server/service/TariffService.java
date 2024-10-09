package ru.orbitel.server.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    public ResponseEntity<List<Tariff>> getTariffs() {
        return new ResponseEntity<>(tariffRepository.findAll(), HttpStatus.OK);
    }
}
