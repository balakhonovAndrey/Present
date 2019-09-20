package com.company.balakhonov.andrey;

public class Jellybean extends Sweetness {

    private String country;

    public Jellybean(String title, double weight, double cost, String country) {
        super(title, weight, cost);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Сладость (" +
                "Название: " + getTitle() +
                ", Вес: " + getWeight() +
                ", Цена: " + getCost() +
                ", Страна: " + getCountry() +
                ")";
    }
}
