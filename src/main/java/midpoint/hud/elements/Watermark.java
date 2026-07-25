package midpoint.hud.elements;

import midpoint.hud.HudElement;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.text.Text;

public class Watermark extends HudElement {

    private final MinecraftClient client = MinecraftClient.getInstance();

    public Watermark() {
        super("Watermark");
    }

    @Override
    public void render(DrawContext context) {

        if (client.player == null) {
            return;
        }

        int x = 6;
        int y = 6;

        context.fill(
                x,
                y,
                x + 120,
                y + 20,
                0xAA101010
        );

        context.drawText(
                client.textRenderer,
                Text.of("Midpoint Visuals"),
                x + 6,
                y + 6,
                0xFFFFFFFF,
                true
        );

        context.drawText(
                client.textRenderer,
                Text.of("v1.0"),
                x + 90,
                y + 6,
                0xFF9B5CFF,
                true
        );
    }
}
