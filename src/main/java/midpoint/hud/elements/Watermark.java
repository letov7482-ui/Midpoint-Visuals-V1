package midpoint.hud.elements;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;

public class Watermark {

    private static final MinecraftClient client = MinecraftClient.getInstance();

    private static final String NAME = "Midpoint Visuals";

    public static void render(DrawContext context) {

        if (client.player == null) {
            return;
        }

        MatrixStack matrices = context.getMatrices();

        float x = 6;
        float y = 6;

        // Фон
        context.fill(
                (int) x,
                (int) y,
                (int) x + 120,
                (int) y + 20,
                0xAA101010
        );

        // Текст
        context.drawText(
                client.textRenderer,
                Text.of(NAME),
                (int) x + 6,
                (int) y + 6,
                0xFFFFFFFF,
                true
        );

        // Версия
        context.drawText(
                client.textRenderer,
                Text.of("v1.0"),
                (int) x + 85,
                (int) y + 6,
                0xFF9B5CFF,
                true
        );
    }
}
