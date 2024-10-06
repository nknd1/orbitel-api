package ru.orbitel.server.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import ru.orbitel.server.model.Tariff;
import ru.orbitel.server.service.TariffService;

import java.util.List;


@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/orbitel")
public class TariffController {

    Logger logger = LoggerFactory.getLogger(TariffController.class);

   private final TariffService tariffService;

    public TariffController(TariffService tariffService) {
        this.tariffService = tariffService;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/tariffs")
    List<Tariff> getTariffs() {
        return tariffService.getTariffs();
    }

}

