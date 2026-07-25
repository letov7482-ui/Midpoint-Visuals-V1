package midpoint.core;


import midpoint.event.EventManager;
import midpoint.hud.Huds;
import midpoint.module.Modules;
import midpoint.theme.ThemeManager;


public class Managers {


    public static final ThemeManager THEME =
            new ThemeManager();


    public static final EventManager EVENTS =
            new EventManager();


    public static void initialize() {


        EVENTS.initialize();

        THEME.initialize();

        Huds.initialize();

        Modules.initialize();

    }

}
