package midpoint.render;

import net.minecraft.client.gui.DrawContext;


public class Renderer {


    private Renderer() {
        // utility class
    }



    public static void drawRect(
            DrawContext context,
            int x,
            int y,
            int width,
            int height,
            int color
    ) {

        context.fill(
                x,
                y,
                x + width,
                y + height,
                color
        );

    }



    public static void drawText(
            DrawContext context,
            String text,
            float x,
            float y,
            int color
    ) {

        context.drawText(
                net.minecraft.client.MinecraftClient
                        .getInstance()
                        .textRenderer,

                text,

                (int) x,
                (int) y,

                color,

                true
        );

    }

}
