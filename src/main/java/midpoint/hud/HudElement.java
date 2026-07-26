package midpoint.hud;

import midpoint.hud.setting.HudPosition;
import net.minecraft.client.gui.DrawContext;

public abstract class HudElement {

    private final HudPosition position;
    private boolean enabled = true;

    public HudElement(float x, float y) {
        this.position = new HudPosition(x, y);
    }

    public abstract void render(DrawContext context);

    public float getX() {
        return position.getX();
    }

    public float getY() {
        return position.getY();
    }

    public void setPosition(float x, float y) {
        position.setPosition(x, y);
    }

    public HudPosition getPosition() {
        return position;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
