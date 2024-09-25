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

    @GetMapping("/tariffs")
    public ResponseEntity<?> getTariffs(@RequestBody Tariff tariff) {
        try {
            tariffRepository.findAll();
            return new ResponseEntity<>(tariffRepository.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Tariffs not found", HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/tariffs")
    public ResponseEntity<String> createTariff(@RequestBody Tariff tariff) {
        try {
            tariffRepository.save(new Tariff(tariff.getTariffName(), tariff.getPricePerMonth(), tariff.getSpeed()));
            return new ResponseEntity<>("Tariff created", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Tariff not created", HttpStatus.BAD_REQUEST);
        }
    }
}

