package midpoint.render;

import net.minecraft.client.gui.DrawContext;


public class ShadowRenderer {


    private ShadowRenderer() {
        // utility class
    }



    public static void drawShadow(
            DrawContext context,
            float x,
            float y,
            float width,
            float height,
            int shadowSize,
            int color
    ) {


        // Нижняя тень

        context.fill(
                (int) (x + shadowSize),
                (int) (y + height),
                (int) (x + width + shadowSize),
                (int) (y + height + shadowSize),
                color
        );


        // Правая тень

        context.fill(
                (int) (x + width),
                (int) (y + shadowSize),
                (int) (x + width + shadowSize),
                (int) (y + height),
                color
        );


        // Мягкое затемнение вокруг

        context.fill(
                (int) x,
                (int) (y + height),
                (int) (x + width),
                (int) (y + height + shadowSize),
                color
        );


        context.fill(
                (int) (x + width),
                (int) y,
                (int) (x + width + shadowSize),
                (int) (y + height),
                color
        );

    }



    public static int createShadowColor(
            int alpha
    ) {

        return ColorUtil.withAlpha(
                0xFF000000,
                alpha
        );

    }


}
