package midpoint.module;

import midpoint.module.impl.visual.ExampleVisual;

public class Modules {


    public static final ModuleManager MANAGER =
            new ModuleManager();


    public static void initialize() {


        MANAGER.register(
                new ExampleVisual()
        );


    }


}
