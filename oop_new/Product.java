package oop_new;

public abstract class Product{
    private String name;
    private double price;
    
    public Product(String name, double price){
        this.name = name;
        this. price = price;
    }
    // получаем имя-геттер
    public String getName(){
        return name;
    }
    // вводим имя-сеттер
    public void setName(String name){
        this.name = name;
    }
    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public String toString(){
        return "Product{" + "name=" + name + "\"" + "price=" + price + "}";
    }
}

