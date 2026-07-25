package midpoint.core;


import midpoint.module.Modules;
import midpoint.theme.ThemeManager;


public class Managers {


    public static final ThemeManager THEME =
            new ThemeManager();



    public static void initialize() {


        THEME.initialize();

        Modules.initialize();


    }


}
