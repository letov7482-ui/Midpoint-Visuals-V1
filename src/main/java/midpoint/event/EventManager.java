package midpoint.event;

import midpoint.core.manager.Manager;
import midpoint.test.TickTest;


public class EventManager implements Manager {


    private final EventBus eventBus = new EventBus();


    @Override
    public void initialize() {

        eventBus.register(new TickTest());

    }


    public EventBus getEventBus() {

        return eventBus;

    }

}
