package ru.orbitel.server.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.orbitel.server.model.Tariff;
import ru.orbitel.server.service.TariffService;

import java.util.List;


@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequiredArgsConstructor
@RequestMapping("/orbitel")
public class TariffController {

   private final TariffService tariffService;

   @CrossOrigin(origins = "*", allowedHeaders = "*")
   @GetMapping("/tariffs")
   public ResponseEntity<List<Tariff>> getTariffs() {
        return tariffService.getTariffs();
    }
}

