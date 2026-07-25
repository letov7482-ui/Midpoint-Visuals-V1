package midpoint.module;

import java.util.ArrayList;
import java.util.List;

import midpoint.event.Subscribe;
import midpoint.event.events.TickEvent;
import midpoint.setting.Setting;


public abstract class Module {

    private final String name;

    private final Category category;

    private boolean enabled;


    private final List<Setting<?>> settings = new ArrayList<>();


    public Module(
            String name,
            Category category
    ) {

        this.name = name;
        this.category = category;
        this.enabled = false;

    }


    public void toggle() {

        enabled = !enabled;

        if (enabled) {

            onEnable();

        } else {

            onDisable();

        }

    }


    public void setEnabled(boolean enabled) {

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


    protected void onEnable() {

    }


    protected void onDisable() {

    }


    @Subscribe
    public void handleTick(TickEvent event) {

        if (enabled) {

            onTick();

        }

    }


    public void onTick() {

    }


    public void onRender() {

    }

}
