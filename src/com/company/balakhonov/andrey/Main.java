package com.company.balakhonov.andrey;

public class Main {

    public static void main(String[] args) {

        Jellybean jellybean1 = new Jellybean("Jelly Bean", 150, 50, "USA");
        Jellybean jellybean2 = new Jellybean("Jelly Bean", 250, 95, "USA");
        RitterSport ritterSport1 = new RitterSport("Ritter Sport Black", 350, 170, 500);
        RitterSport ritterSport2 = new RitterSport("Ritter Sport White", 350, 170, 500);
        RitterSport ritterSport3 = new RitterSport("Ritter Sport Classic", 350, 170, 500);
        Oreo oreo1 = new Oreo("Oreo", 250, 220, 15);
        Oreo oreo2 = new Oreo("Oreo", 500, 440, 30);
        Milka milka1 = new Milka("Milka", 190, 150, "31-05-2020");
        Milka milka2 = new Milka("Milka Bubble", 230, 190, "30-06-2020");
        Donut donut1 = new Donut("Пончик Today Donut", 50,75,true);
        Donut donut2 = new Donut("Пончик Today Donut", 40,65,false);

        Present present = new Present();

        present.add(jellybean1);
        present.add(jellybean2);
        present.add(ritterSport1);
        present.add(ritterSport2);
        present.add(ritterSport3);
        present.add(oreo1);
        present.add(oreo2);
        present.add(milka1);
        present.add(milka2);
        present.add(donut1);
        present.add(donut2);

        present.getInfo();
        System.out.println("Вес подарка: " + present.getWeight());
        System.out.println("Цена подарка: " + present.getCost());


        System.out.println("============================");

        present.deleteByIndex(3);
        present.deleteLast();


        System.out.println("============================");

        present.getInfo();
        System.out.println("Вес подарка: " + present.getWeight());
        System.out.println("Цена подарка: " + present.getCost());

    }
}
