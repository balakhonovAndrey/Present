package com.company.balakhonov.andrey;

public class RitterSport extends Sweetness {

    private int kkal;

    public RitterSport(String title, double weight, double cost, int kkal) {
        super(title, weight, cost);
        this.kkal = kkal;
    }

    public int getKkal() {
        return kkal;
    }

    public void setKkal(int kkal) {
        this.kkal = kkal;
    }

    @Override
    public String toString() {
        return "Сладость (" +
                "Название: " + getTitle() +
                ", Вес: " + getWeight() +
                ", Цена: " + getCost() +
                ", Калорийность: " + getKkal() +
                ")";
    }
}
