package midpoint.core;


import midpoint.hud.Huds;
import midpoint.module.Modules;
import midpoint.theme.ThemeManager;


public class Managers {


    public static final ThemeManager THEME =
            new ThemeManager();



    public static void initialize() {


        THEME.initialize();

        Huds.initialize();

        Modules.initialize();


    }


}
