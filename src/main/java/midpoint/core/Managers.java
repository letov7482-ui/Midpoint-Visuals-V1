package midpoint.core;

import midpoint.core.manager.ManagerRegistry;

public class Managers {

    private static final ManagerRegistry REGISTRY =
            new ManagerRegistry();

    public static void initialize() {

        REGISTRY.initializeAll();

    }

    public static ManagerRegistry getRegistry() {
        return REGISTRY;
    }
}
