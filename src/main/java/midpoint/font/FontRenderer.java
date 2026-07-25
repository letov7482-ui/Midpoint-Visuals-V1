package midpoint.font;

import net.minecraft.client.gui.DrawContext;

public class FontRenderer {


    public void draw(
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


    public int getWidth(String text) {

        return net.minecraft.client.MinecraftClient
                .getInstance()
                .textRenderer
                .getWidth(text);

    }

}
