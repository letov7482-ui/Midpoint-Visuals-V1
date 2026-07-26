package midpoint.render;

import net.minecraft.client.gui.DrawContext;


public class RoundedRenderer {


    private RoundedRenderer() {
        // utility class
    }



    public static void drawRound(
            DrawContext context,
            float x,
            float y,
            float width,
            float height,
            float radius,
            int color
    ) {

        /*
         * Пока используем базовую отрисовку.
         * Позже сюда подключим настоящий
         * rounded shader с мягкими углами,
         * blur и glow.
         */


        context.fill(
                (int) x,
                (int) y,
                (int) (x + width),
                (int) (y + height),
                color
        );


    }



    public static void drawOutline(
            DrawContext context,
            float x,
            float y,
            float width,
            float height,
            float radius,
            int color
    ) {


        // Верх
        context.fill(
                (int) x,
                (int) y,
                (int) (x + width),
                (int) (y + 1),
                color
        );


        // Низ
        context.fill(
                (int) x,
                (int) (y + height - 1),
                (int) (x + width),
                (int) (y + height),
                color
        );


        // Лево
        context.fill(
                (int) x,
                (int) y,
                (int) (x + 1),
                (int) (y + height),
                color
        );


        // Право
        context.fill(
                (int) (x + width - 1),
                (int) y,
                (int) (x + width),
                (int) (y + height),
                color
        );

    }

}
