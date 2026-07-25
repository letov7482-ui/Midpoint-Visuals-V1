package midpoint.event;

import midpoint.core.manager.Manager;

public class EventManager implements Manager {


    private final EventBus eventBus = new EventBus();


    @Override
    public void initialize() {

    }


    public EventBus getEventBus() {

        return eventBus;

    }

}
