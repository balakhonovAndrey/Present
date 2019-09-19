package com.company.balakhonov.andrey;

public class Donut extends Sweetness {

    private boolean ifFill = false;

    public Donut(String title, double weight, double cost, boolean ifFill) {
        super(title, weight, cost);
        this.ifFill = ifFill;
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

    public boolean isIfFill() {
        return ifFill;
    }

    public void setIfFill(boolean ifFill) {
        this.ifFill = ifFill;
    }

    @Override
    public String toString() {
        return "Сладость (" +
                "Название: " + getTitle() +
                ", Вес: " + getWeight() +
                ", Цена: " + getCost() +
                ", Есть ли начинка: " + isIfFill() +
                ")";
    }
}
