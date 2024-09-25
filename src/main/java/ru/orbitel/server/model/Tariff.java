package ru.orbitel.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;


@Table(name = "tariffs")
public class Tariff {
   @Id
   private @Column("tariff_id") long tariffId;
    private @Column("tariff_name") String tariffName;
    private @Column("tariff_price") int pricePerMonth;
    private @Column ("speed") String speed;

    public void setTariffId(long tariffId) {
        this.tariffId = tariffId;
    }

    public long getTariff() {
        return tariffId;
    }

    public String getTariffName() {
        return tariffName;
    }

    public void setTariffName(String tariffName) {
        this.tariffName = tariffName;
    }

    public int getPricePerMonth() {
        return pricePerMonth;
    }

    public void setPricePerMonth(int pricePerMonth) {
        this.pricePerMonth = pricePerMonth;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public Tariff(String tariffName) {

    }

    public Tariff(long tariffId, String tariffName, int pricePerMonth, String speed) {
        this.tariffId = tariffId;
        this.tariffName = tariffName;
        this.pricePerMonth = pricePerMonth;
        this.speed = speed;
    }
    @JsonCreator
    public Tariff(@JsonProperty String tariffName,
                  @JsonProperty int pricePerMonth,
                  @JsonProperty String speed) {
        this.tariffName = tariffName;
        this.pricePerMonth = pricePerMonth;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Tariff{" +
                "tariff_id=" + tariffId +
                ", tariff_name='" + tariffName + '\'' +
                ", price_per_month=" + pricePerMonth +
                ", speed='" + speed + '\'' +
                '}';
    }


}
