package ru.orbitel.server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tariff {
    private long tariffId;
    private String tariffName;
    private BigDecimal pricePerMonth;
    private String speed;
}
