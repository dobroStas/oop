package oop_new.seminar2;

public class main {
    public static void main(String[] args) {
        classHuman human1 = new classHuman("Alex");
        classHuman human2 = new classHuman("Ivan");

        System.out.println(human1.name);


        classMarket market = new classMarket();
        market.acceptToMarket(human1);
        // market.update();
        market.acceptToMarket(human2);
        market.update();

    }
}
