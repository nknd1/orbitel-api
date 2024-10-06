package ru.orbitel.server.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;


@Table(name = "tariffs")
public class Tariff {
   @Id
   private @Column("tariff_id") long tariffId;
   private @Column("tariff_name") String tariffName;
   private @Column("tariff_price") BigDecimal pricePerMonth;
   private @Column ("speed") String speed;

    public void setTariffId(long tariffId) {
        this.tariffId = tariffId;
    }

    public long getTariffId() {
        return tariffId;
    }

    public String getTariffName() {
        return tariffName;
    }

    public void setTariffName(String tariffName) {
        this.tariffName = tariffName;
    }

    public BigDecimal getPricePerMonth() {
        return pricePerMonth;
    }

    public void setPricePerMonth(BigDecimal pricePerMonth) {
        this.pricePerMonth = pricePerMonth;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }


    public Tariff(Long tariffId, String tariffName, BigDecimal pricePerMonth, String speed)
    {
        this.tariffId = tariffId;
        this.tariffName = tariffName;
        this.pricePerMonth = pricePerMonth;
        this.speed = speed;
    }

    public Tariff() {
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
