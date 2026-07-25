package midpoint.module;

import java.util.ArrayList;
import java.util.List;

public class ModuleManager {


    private final List<Module> modules = new ArrayList<>();


    public void register(Module module) {

        modules.add(module);

    }


    public List<Module> getModules() {

        return modules;

    }


    public <T extends Module> T getModule(Class<T> clazz) {

        for (Module module : modules) {

            if (clazz.isAssignableFrom(module.getClass())) {

                return clazz.cast(module);

            }

        }

        return null;
    }

}
