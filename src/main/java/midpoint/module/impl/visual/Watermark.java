package midpoint.module.impl.visual;

import midpoint.module.Category;
import midpoint.module.Module;


public class Watermark extends Module {


    public Watermark() {

        super(
                "Watermark",
                Category.VISUAL
        );

    }


    @Override
    protected void onEnable() {

    }


    @Override
    protected void onDisable() {

    }


    @Override
    public void onRender() {

        // Здесь позже будет отрисовка Midpoint Visuals

    }

}
