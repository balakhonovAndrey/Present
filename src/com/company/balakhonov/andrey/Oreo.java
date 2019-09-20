package com.company.balakhonov.andrey;

public class Oreo extends Sweetness {

    private int pieceInBox;

    public Oreo(String title, double weight, double cost, int pieceInBox) {
        super(title, weight, cost);
        this.pieceInBox = pieceInBox;
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
