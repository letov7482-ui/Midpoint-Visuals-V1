package midpoint.module;

import midpoint.module.settings.Setting;

import java.util.ArrayList;
import java.util.List;

public abstract class Module {

    private final String name;
    private final Category category;

    private boolean enabled;

    private final List<Setting<?>> settings = new ArrayList<>();


    public Module(String name, Category category) {

        this.name = name;
        this.category = category;

    }


    public void toggle() {

        setEnabled(!enabled);

    }


    public void setEnabled(boolean enabled) {

        if (this.enabled == enabled) {
            return;
        }

        this.enabled = enabled;


        if (enabled) {

            onEnable();

        } else {

            onDisable();

        }

    }


    public boolean isEnabled() {

        return enabled;

    }


    public String getName() {

        return name;

    }


    public Category getCategory() {

        return category;

    }


    public void addSetting(Setting<?> setting) {

        settings.add(setting);

    }


    public List<Setting<?>> getSettings() {

        return settings;

    }


    public void onEnable() {

    }


    public void onDisable() {

    }

}
