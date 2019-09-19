package com.company.balakhonov.andrey;

import java.util.Date;
import java.util.GregorianCalendar;

public class Milka extends Sweetness {

    private String expirationDate;

    public Milka(String title, double weight, double cost, String expirationDate) {
        super(title, weight, cost);
        this.expirationDate = expirationDate;
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

    @Override
    public double getWeight() {
        return super.getWeight();
    }

    @Override
    public void setWeight(double weight) {
        super.setWeight(weight);
    }

    @Override
    public double getCost() {
        return super.getCost();
    }

    @Override
    public void setCost(double cost) {
        super.setCost(cost);
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
