package ru.orbitel.server.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import ru.orbitel.server.model.Tariff;
import ru.orbitel.server.repository.TariffRepository;

import java.util.List;


@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/orbitel")
public class TariffController {

    Logger logger = LoggerFactory.getLogger(TariffController.class);

    private final TariffRepository tariffRepository;

    public TariffController(TariffRepository tariffRepository) {
        this.tariffRepository = tariffRepository;
    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/tariffs")
    List<Tariff> getTariffs() {
        return tariffRepository.findAll();
    }
}

