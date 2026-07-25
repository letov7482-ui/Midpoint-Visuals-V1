package midpoint.render.ui;


import net.minecraft.client.gui.DrawContext;
import midpoint.render.util.ColorUtil;



public class RoundedRenderer {


    public static void drawRoundedRect(
            DrawContext context,
            float x,
            float y,
            float width,
            float height,
            float radius,
            int color
    ) {


        /*
         * Здесь будет наша собственная
         * система отрисовки скруглённых панелей.
         *
         * Сейчас создаём основу.
         */


        context.fill(
                (int)x,
                (int)y,
                (int)(x + width),
                (int)(y + height),
                color
        );

    }

}
