package midpoint.setting;

public class BooleanSetting extends Setting<Boolean> {

    public BooleanSetting(
            String name,
            boolean value
    ) {
        super(name, value);
    }


    public boolean get() {

        return getValue();

    }


    public boolean isEnabled() {

        return getValue();

    }


    public void toggle() {

        setValue(!getValue());

    }

}
