package midpoint.hud;

import midpoint.hud.elements.Watermark;

public class Huds {

    public static final HudManager MANAGER = new HudManager();

    public static void initialize() {

        MANAGER.register(new Watermark());

    }

}
