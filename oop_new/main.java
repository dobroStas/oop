package oop_new;

import java.util.ArrayList;
import java.util.List;


public class main {
    public static void main (String[] args) {
        // List <BottleOfWater> listProduct = new ArrayList<>();
        // listProduct.add(new BottleOfWater("Fanta", 54.5, 500));
        // listProduct.add(new BottleOfWater("Sprite", 94, 2000));
        // listProduct.add(new BottleOfWater("7up", 54.5, 500));
        // listProduct.add(new BottleOfWater("Merinda", 75.2, 1000));
        // listProduct.add(new BottleOfWater("mnt.Dew", 32, 330));
        // BottleOfWaterVendingMashine vendingMashine = new BottleOfWaterVendingMashine(listProduct);
        // System.out.println(vendingMashine.getProduct("Fanta"));
        // System.out.println(vendingMashine.getProduct("7up",500));



        List <hotDrink> listProduct1 = new ArrayList<>();
        listProduct1.add(new hotDrink("Coffee", 100, 250, 30));
        listProduct1.add(new hotDrink("Tea", 50, 500, 36));
        listProduct1.add(new hotDrink("Watter", 25, 330, 38));
        listProduct1.add(new hotDrink("Milk", 75.2, 100, 25));
        hotDrinkVendingMashine hotDrinkVendingMashine = new hotDrinkVendingMashine(listProduct1);
        System.out.println(hotDrinkVendingMashine.getProduct("Coffee"));
        System.out.println(hotDrinkVendingMashine.getProduct("Tea", 500, 36));
        System.out.println(hotDrinkVendingMashine.getProduct("Milk", 100));



    }
    
}
