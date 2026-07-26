package midpoint.core;

import midpoint.hud.Huds;
import midpoint.hud.config.HudConfig;
import midpoint.module.ModuleManager;

public class MidpointClient {

    public static final MidpointClient INSTANCE = new MidpointClient();

    private final ModuleManager moduleManager = new ModuleManager();

    public void initialize() {

        moduleManager.initialize();

        Huds.init();

        HudConfig.load();

    }

    public ModuleManager getModuleManager() {
        return moduleManager;
    }

}
