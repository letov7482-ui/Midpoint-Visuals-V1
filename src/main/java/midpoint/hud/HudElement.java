package midpoint.hud;

import net.minecraft.client.gui.DrawContext;


public abstract class HudElement {


    private final String name;


    private boolean enabled = true;



    public HudElement(
            String name
    ) {

        this.name = name;

    }



    public String getName() {

        return name;

    }



    public boolean isEnabled() {

        return enabled;

    }



    public void setEnabled(
            boolean enabled
    ) {

        this.enabled = enabled;

    }



    /*
     * Главный метод рендера
     */
    public abstract void render(
            DrawContext context
    );



    /*
     * Позиция HUD
     */

    public abstract float getX();



    public abstract float getY();



    public abstract void setPosition(
            float x,
            float y
    );



}
