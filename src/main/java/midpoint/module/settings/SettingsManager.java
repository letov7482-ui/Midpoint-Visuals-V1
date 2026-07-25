package midpoint.module.settings;

import java.util.ArrayList;
import java.util.List;

public class SettingsManager {


    private final List<Setting<?>> settings =
            new ArrayList<>();


    public void register(Setting<?> setting) {

        settings.add(setting);

    }


    public List<Setting<?>> getSettings() {

        return settings;

    }
}
