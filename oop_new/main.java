package oop_new;

import java.util.ArrayList;
import java.util.List;


public class main {
    public static void main (String[] args) {
        List <BottleOfWater> listProduct = new ArrayList<>();
        listProduct.add(new BottleOfWater("Fanta", 54.5, 500));
        listProduct.add(new BottleOfWater("Sprite", 94, 2000));
        listProduct.add(new BottleOfWater("7up", 54.5, 500));
        listProduct.add(new BottleOfWater("Merinda", 75.2, 1000));
        listProduct.add(new BottleOfWater("mnt.Dew", 32, 330));
        BottleOfWaterVendingMashine vendingMashine = new BottleOfWaterVendingMashine(listProduct);
        System.out.println(vendingMashine.getProduct("Fanta"));
        System.out.println(vendingMashine.getProduct("7up",500));

    }
    
}
