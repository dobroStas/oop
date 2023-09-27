package oop_new;

public class BottleOfWater extends Product{

    private int volume;
    public BottleOfWater(String name, double price, int volume){
        super(name, price);
        this.volume = volume;
    }

    public int getVolume(){
        return volume;
    }
    public void setVolume(int volume){
        this.volume = volume;
    }

    @Override
    public String toString(){
        return "BottleOfWatter{ "  + "name=" + super.getName() + " \\ " + "price=" + super.getPrice() + " \\ " + "volume=" + volume + " }";
    }
    
}
