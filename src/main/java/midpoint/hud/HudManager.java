package midpoint.hud;

import net.minecraft.client.gui.DrawContext;

import java.util.ArrayList;
import java.util.List;

public class HudManager {

    private final List<HudElement> elements = new ArrayList<>();

    public void register(HudElement element) {
        elements.add(element);
    }

    public void renderAll(DrawContext context) {

        for (HudElement element : elements) {

            if (element.isEnabled()) {
                element.render(context);
            }

        }

    }

    public List<HudElement> getElements() {
        return elements;
    }

}
