package ru.orbitel.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;



public class Tariff {
    private long tariff_id;
    private String tariff_name;
    private int price_per_month;
    private String speed;

    public void setTariff_id(long tariff_id) {
        this.tariff_id = tariff_id;
    }

    public long getTariff_id() {
        return tariff_id;
    }

    public String getTariff_name() {
        return tariff_name;
    }

    public void setTariff_name(String tariff_name) {
        this.tariff_name = tariff_name;
    }

    public int getPrice_per_month() {
        return price_per_month;
    }

    public void setPrice_per_month(int price_per_month) {
        this.price_per_month = price_per_month;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public Tariff(String tariffName) {
        // TODO document why this constructor is empty
    }

    public Tariff(long tariff_id, String tariff_name, int price_per_month, String speed) {
        this.tariff_id = tariff_id;
        this.tariff_name = tariff_name;
        this.price_per_month = price_per_month;
        this.speed = speed;
    }
    @JsonCreator
    public Tariff(@JsonProperty String tariff_name,
                  @JsonProperty int price_per_month,
                  @JsonProperty String speed) {
        this.tariff_name = tariff_name;
        this.price_per_month = price_per_month;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Tariff{" +
                "tariff_id=" + tariff_id +
                ", tariff_name='" + tariff_name + '\'' +
                ", price_per_month=" + price_per_month +
                ", speed='" + speed + '\'' +
                '}';
    }


}
