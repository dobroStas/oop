package oop_new;

public class hotDrink extends Product{
    private int volume;
    private int temperature;
    public hotDrink(String name, double price, int volume, int temperature){
        super(name, price);
        this.volume = volume;
        this.temperature = temperature;
    }

    public int getTemperature(){
        return temperature;
    }
    public void setTemperture(int temperature){
        this.temperature = temperature;
    }
    public int getVolume(){
        return temperature;
    }
    public void setVolume(int temperature){
        this.temperature = temperature;
    }

    @Override
    public String toString(){
        return "BottleOfWatter{ "  + "name=" + super.getName() + " \\ " + "price=" + super.getPrice() + " \\ " + "volume=" + volume +  "temperature=" + temperature + " }";
    }
}
