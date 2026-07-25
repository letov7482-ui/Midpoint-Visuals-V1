package midpoint.test;

import midpoint.event.Subscribe;
import midpoint.event.events.TickEvent;

public class TickTest {


    @Subscribe
    public void onTick(TickEvent event) {

        System.out.println("Midpoint Tick!");

    }

}
