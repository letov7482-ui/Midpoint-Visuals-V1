package midpoint.module;

import java.util.ArrayList;
import java.util.List;

import midpoint.core.Managers;
import midpoint.module.impl.visual.ExampleVisual;


public class ModuleManager {


    private final List<Module> modules = new ArrayList<>();


    public void initialize() {

        register(
                new ExampleVisual()
        );

    }


    public void register(Module module) {

        modules.add(module);


        Managers.EVENTS
                .getEventBus()
                .register(module);

    }


    public List<Module> getModules() {

        return modules;

    }


    public Module getModule(
            String name
    ) {

        for (Module module : modules) {

            if (module.getName().equalsIgnoreCase(name)) {

                return module;

            }

        }


        return null;

    }


}
