package seminar1;
import seminar1.product_copy;
import java.util.Calendar;

public abstract class product {
    private String name;
    private int price;
    private int quantity;
    // private int [] storage;
    private Calendar bestBefore;
    private double volume;
    private double weight;


    public product(String name, int price, int quantity, Calendar bestBefore, double weight){           //конструктор. имя такое же как у класса
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.bestBefore = bestBefore;
        // this.volume = volume;
        this.weight = weight;


    }

    

    
    

    public String getName(){
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public Calendar getBestBefore() {
        return bestBefore;
    }
    public double getVolume() {
        return volume;
    }


    public double getWeight() {
        return weight;
    }


    public void setName(String name){
        this.name = name;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setBestBefore(Calendar bestBefore) {
        this.bestBefore = bestBefore;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
            return "product [name=" + name + ", price=" + price + ", quantity=" + quantity + ", bestBefore=" + bestBefore.get(Calendar.YEAR) + "."
                    + bestBefore.get(Calendar.MONTH) + "." + bestBefore.get(Calendar.DATE) + ", volume=" + volume + "]";
        }
    // @Override
    // public String toString() {
    //     return "product [name=" + name + ", price=" + price + ", quantity=" + quantity + ", bestBefore=" + bestBefore.get(Calendar.YEAR) + "."
    //             + bestBefore.get(Calendar.MONTH) + "." + bestBefore.get(Calendar.DATE) + ", weight=" + weight + "]";
    // }

    




    
}
