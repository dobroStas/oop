package seminar1;

import java.util.Calendar;

public class food extends product{

    public food(String name, int price, int quantity, Calendar bestBefore, double weight){           //конструктор. имя такое же как у класса
       super(name, price, quantity, bestBefore, weight);
    }
}
