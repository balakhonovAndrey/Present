package com.company.balakhonov.andrey;

public abstract class Sweetness {

    private String title;
    private double weight;
    private double cost;

    public Sweetness(String title, double weight, double cost) {
        this.title = title;
        this.weight = weight;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Сладость (" + "Название: " + title + ", Вес: " + weight + ", Цена: " + cost + ")" + "\n";
    }
}
