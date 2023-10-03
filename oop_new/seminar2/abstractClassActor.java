package oop_new.seminar2;

public abstract class abstractClassActor implements interfaceActorBehavior{
    
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;


    

    public void setName(String name){
        this.name = name;
    }

    public void setMakeOrder(boolean makeOrder){
        isMakeOrder = makeOrder;
    }

    public void setTakeOrder(boolean takeOrder){
        isTakeOrder = takeOrder;
    }

    public abstractClassActor(String name) {
        this.name = name;
    }

    public abstract String getName();


}
