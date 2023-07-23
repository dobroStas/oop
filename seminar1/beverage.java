package seminar1;

import java.util.Calendar;

public class beverage extends product{

    public beverage(String name, int price, int quantity, Calendar bestBefore, double volume){           //конструктор. имя такое же как у класса
       super(name, price, quantity, bestBefore, volume);
    }
}
