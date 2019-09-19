package com.company.balakhonov.andrey;

public interface PresentBox {
    public void add(Sweetness item);
    public void deleteByIndex(int index);
    public void deleteLast();
    public double getWeight();
    public double getCost();
    public void getInfo();
//    public void reduceWeight(double value);
//    public void reduceCost(double value);
}
