package midpoint.module.impl.visual;

import midpoint.module.Category;
import midpoint.module.Module;
import midpoint.module.settings.BooleanSetting;

public class ExampleVisual extends Module {


    private final BooleanSetting exampleSetting =
            new BooleanSetting(
                    "Example Option",
                    true
            );


    public ExampleVisual() {

        super(
                "Example Visual",
                Category.VISUAL
        );

        addSetting(exampleSetting);

    }


    @Override
    public void onEnable() {

        System.out.println(
                "Example Visual enabled"
        );

    }


    @Override
    public void onDisable() {

        System.out.println(
                "Example Visual disabled"
        );

    }

}
