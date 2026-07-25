package midpoint.core.manager;

import java.util.ArrayList;
import java.util.List;

public class ManagerRegistry {

    private final List<Manager> managers = new ArrayList<>();

    public void register(Manager manager) {
        managers.add(manager);
    }

    public void initializeAll() {

        for (Manager manager : managers) {
            manager.initialize();
        }
    }

    public void shutdownAll() {

        for (Manager manager : managers) {
            manager.shutdown();
        }
    }
}
