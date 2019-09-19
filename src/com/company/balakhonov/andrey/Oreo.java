package com.company.balakhonov.andrey;

public class Oreo extends Sweetness {

    private int pieceInBox;

    public Oreo(String title, double weight, double cost, int pieceInBox) {
        super(title, weight, cost);
        this.pieceInBox = pieceInBox;
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

    public int getPieceInBox() {
        return pieceInBox;
    }

    public void setPieceInBox(int pieceInBox) {
        this.pieceInBox = pieceInBox;
    }

    @Override
    public String toString() {
        return "Сладость (" +
                "Название: " + getTitle() +
                ", Вес: " + getWeight() +
                ", Цена: " + getCost() +
                ", Кол-во в упаковке: " + getPieceInBox() +
                ")";
    }
}
