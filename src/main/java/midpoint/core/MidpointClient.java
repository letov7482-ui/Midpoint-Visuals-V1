package midpoint.core;

import midpoint.module.ModuleManager;


public class MidpointClient {


    public static final MidpointClient INSTANCE = new MidpointClient();


    private final ModuleManager moduleManager = new ModuleManager();


    public void initialize() {

        moduleManager.initialize();

    }


    public ModuleManager getModuleManager() {

        return moduleManager;

    }


}
