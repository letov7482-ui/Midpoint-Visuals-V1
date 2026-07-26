package midpoint.hud.elements;

import midpoint.hud.HudElement;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;

public class Watermark extends HudElement {

    public Watermark() {
        super(5, 5);
    }

    @Override
    public void render(DrawContext context) {

        MinecraftClient client = MinecraftClient.getInstance();

        context.drawText(
                client.textRenderer,
                "Midpoint Visuals",
                (int) getX(),
                (int) getY(),
                0xFFFFFFFF,
                true
        );

    }

}
