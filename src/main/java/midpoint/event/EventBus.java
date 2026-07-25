package midpoint.event;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class EventBus {

    private final List<Object> listeners = new ArrayList<>();


    public void register(Object object) {
        listeners.add(object);
    }


    public void unregister(Object object) {
        listeners.remove(object);
    }


    public void post(Event event) {

        for (Object listener : listeners) {

            Method[] methods = listener.getClass().getDeclaredMethods();

            for (Method method : methods) {

                if (!method.isAnnotationPresent(Subscribe.class)) {
                    continue;
                }

                if (method.getParameterCount() != 1) {
                    continue;
                }

                if (!method.getParameterTypes()[0]
                        .isAssignableFrom(event.getClass())) {
                    continue;
                }

                try {

                    method.setAccessible(true);
                    method.invoke(listener, event);

                } catch (Exception exception) {

                    exception.printStackTrace();

                }
            }
        }
    }
}
