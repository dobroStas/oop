package oop_new.seminar2;

import java.util.List;

public interface interfaceMarketBehaviour {
 
    void acceptToMarket(abstractClassActor actor);

    void releaseFromMarket(List<abstractClassActor> actors);
    
    void update();
}
