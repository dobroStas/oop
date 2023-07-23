package seminar1;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
public class program {
    public static void main(String[] args) {
        product product1 = new food ("chocolate", 1, 3, new GregorianCalendar(2023, 8, 1), 3.1);
        product product2 = new beverage("cofe", 5, 2, new GregorianCalendar(2027, 3, 1), 0.4);
        product product3 = new beverage("water", 2, 7, new GregorianCalendar(2034, 3, 8), 1.5);
        product product4 = new beverage("juice", 2, 7, new GregorianCalendar(2034, 3, 8), 1.5);
        product product5 = new beverage("tea", 2, 7, new GregorianCalendar(2034, 3, 8), 1.5);


        vendingAvtomat list = new vendingAvtomat();
        List <product> myList = new ArrayList<>();

        myList.add(product1);
        myList.add(product2);
        myList.add(product3);
        myList.add(product4);
        myList.add(product5);
        list.initProducts(myList);


        String name = "chocolate";
        System.out.println(list.getProduct(name).toString());

        String name1 = "cofe";
        System.out.println(list.getProduct(name1).toString());

        String name2 = "water";
        System.out.println(list.getProduct(name2).toString());





}


}
