package midpoint.hud.elements;

import midpoint.hud.HudElement;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.text.Text;

public class Watermark extends HudElement {

    private final MinecraftClient client = MinecraftClient.getInstance();

    public Watermark() {
        super("Watermark", 6, 6);
    }

    @Override
    public void render() {

        if (client.player == null) {
            return;
        }

        DrawContext context = new DrawContext(
                client,
                client.getBufferBuilders().getEntityVertexConsumers()
        );

        int x = (int) getX();
        int y = (int) getY();

        // фон
        context.fill(
                x,
                y,
                x + 140,
                y + 22,
                0xAA101010
        );

        // название
        context.drawText(
                client.textRenderer,
                Text.of("Midpoint Visuals"),
                x + 6,
                y + 7,
                0xFFFFFFFF,
                true
        );

        // версия
        context.drawText(
                client.textRenderer,
                Text.of("v1.0"),
                x + 105,
                y + 7,
                0xFF9B5CFF,
                true
        );
    }
}
