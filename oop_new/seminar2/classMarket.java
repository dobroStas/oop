package oop_new.seminar2;

import java.util.ArrayList;
import java.util.List;

public class classMarket implements interfaceQueueBehaviour, interfaceMarketBehaviour{
    
    private final List<abstractClassActor> actors;
    
    public classMarket (){
        this.actors = new ArrayList<abstractClassActor>();
    }

    @Override
    public void acceptToMarket(abstractClassActor actor){
        System.out.println(actor.getName() + " пришел в магазин");
        takeInQueue(actor);
    }

     @Override
    public void takeInQueue(abstractClassActor actor){
        System.out.println(actor.getName() + " встал в очередь");
        this.actors.add(actor);
    }

    @Override
    public void takeOrders(){
        for(abstractClassActor actor : actors){
            if(!actor.isMakeOrder()){
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " сделал свой заказ");
            }
        }
    }

    @Override
    public void giveOrders(){
        for(abstractClassActor actor : actors){
            if(actor.isMakeOrder()){
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " получил свой заказ");
            }
        }
    }

    @Override
    public void releaseFromQueue(){
        List<abstractClassActor> releasedActors = new ArrayList<>();
        for( abstractClassActor actor : actors){
           if(actor.isMakeOrder()){
                releasedActors.add(actor);
                System.out.println(actor.getName() + " вышел из очереди и готов уходить");
            }

        }
        releaseFromMarket(releasedActors);
    }

    @Override
    public void releaseFromMarket(List<abstractClassActor> actors){
        for( abstractClassActor actor : actors){
            System.out.println(actor.getName() + " вышел из магазина");
            actors.remove(actor);
        }
    }

    @Override
    public void update(){
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }
}
