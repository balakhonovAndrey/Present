package com.company.balakhonov.andrey;

import java.util.Date;
import java.util.GregorianCalendar;

public class Milka extends Sweetness {

    private String expirationDate;

    public Milka(String title, double weight, double cost, String expirationDate) {
        super(title, weight, cost);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "Сладость (" +
                "Название: " + getTitle() +
                ", Вес: " + getWeight() +
                ", Цена: " + getCost() +
                ", Срок годности: " + getExpirationDate() +
                ")";
    }
}
