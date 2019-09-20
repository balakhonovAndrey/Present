package com.company.balakhonov.andrey;

public class Donut extends Sweetness {

    private boolean ifFill = false;

    public Donut(String title, double weight, double cost, boolean ifFill) {
        super(title, weight, cost);
        this.ifFill = ifFill;
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
