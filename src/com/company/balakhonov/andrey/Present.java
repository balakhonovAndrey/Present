package com.company.balakhonov.andrey;

import java.util.Arrays;

public class Present implements PresentBox {

    private Sweetness[] sweetBox = null;

    public Sweetness[] getSweetBox() {
        return sweetBox;
    }

    @Override
    public void add(Sweetness item) {
        if (sweetBox == null) {
            sweetBox = new Sweetness[1];
            sweetBox[0] = item;
        } else {
            sweetBox = Arrays.copyOf(sweetBox, sweetBox.length + 1);
            sweetBox[sweetBox.length-1] = item;
        }
    }

    @Override
    public void deleteByIndex(int index) {
        Sweetness[] newSweetBox = new Sweetness[sweetBox.length - 1];

        System.arraycopy(sweetBox, 0, newSweetBox, 0, index);
        System.arraycopy(sweetBox, index + 1, newSweetBox, index, sweetBox.length - index - 1);

        sweetBox = newSweetBox;
    }

    @Override
    public void deleteLast() {
        if (sweetBox.length == 0) {
            System.out.println("Массив пуст.");
        } else
            sweetBox = Arrays.copyOf(sweetBox, sweetBox.length - 1);
    }

    @Override
    public double getWeight() {
        int weight = 0;

        for (Sweetness item : sweetBox) {
            weight += item.getWeight();
        }

        return weight;
    }

    @Override
    public double getCost() {
        int cost = 0;

        for (Sweetness item : sweetBox) {
            cost += item.getCost();
        }

        return cost;
    }

    @Override
    public void getInfo() {
        for (Sweetness item : sweetBox) {
            System.out.println(item.toString());
        }
    }
}
