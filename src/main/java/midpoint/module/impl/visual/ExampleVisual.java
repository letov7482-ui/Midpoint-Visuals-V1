package midpoint.module.impl.visual;

import midpoint.module.Category;
import midpoint.module.Module;
import midpoint.setting.BooleanSetting;


public class ExampleVisual extends Module {


    private final BooleanSetting exampleSetting;


    public ExampleVisual() {

        super(
                "ExampleVisual",
                Category.VISUAL
        );


        exampleSetting = new BooleanSetting(
                "Example",
                true
        );


        addSetting(exampleSetting);

    }


    @Override
    protected void onEnable() {

    }


    @Override
    protected void onDisable() {

    }


    @Override
    public void onRender() {

        if (!exampleSetting.get()) {
            return;
        }

        // Здесь позже будет визуал

    }

}
