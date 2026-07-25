package midpoint.module.settings;

import java.util.List;

public class ModeSetting extends Setting<String> {


    private final List<String> modes;


    public ModeSetting(
            String name,
            String value,
            List<String> modes
    ) {

        super(name, value);

        this.modes = modes;
    }


    public List<String> getModes() {

        return modes;

    }
}
