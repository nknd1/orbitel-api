package ru.orbitel.server.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.orbitel.server.model.Tariff;
import ru.orbitel.server.repository.TariffRepository;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/orbitel")
public class TariffController {

    Logger logger = LoggerFactory.getLogger(TariffController.class);

    private final TariffRepository tariffRepository;

    public TariffController(TariffRepository tariffRepository) {
        this.tariffRepository = tariffRepository;
    }


    @PostMapping("/tariffs")
    public ResponseEntity<String> createTariff(@RequestBody Tariff tariff) {
        try {
            tariffRepository.save(new Tariff(tariff.getTariff_name(), tariff.getPrice_per_month(), tariff.getSpeed()));
            return new ResponseEntity<>("Tariff created", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Tariff not created", HttpStatus.BAD_REQUEST);
        }
    }
}

