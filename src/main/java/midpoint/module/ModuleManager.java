package midpoint.module;

import java.util.ArrayList;
import java.util.List;


public class ModuleManager {

    private final List<Module> modules = new ArrayList<>();


    public void initialize() {

        // сюда будем добавлять модули

    }


    public void register(Module module) {

        modules.add(module);

    }


    public List<Module> getModules() {

        return modules;

    }


    public Module getModule(String name) {

        for (Module module : modules) {

            if (module.getName().equalsIgnoreCase(name)) {
                return module;
            }

        }

        return null;

    }

}
