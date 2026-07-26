package midpoint.render;

import net.minecraft.client.gui.DrawContext;


public class RenderUtil {


    private RenderUtil() {
        // utility class
    }



    /*
     * Красивый HUD блок:
     * тень + фон
     */
    public static void drawPanel(
            DrawContext context,
            float x,
            float y,
            float width,
            float height
    ) {


        ShadowRenderer.drawShadow(
                context,
                x,
                y,
                width,
                height,
                4,
                ShadowRenderer.createShadowColor(80)
        );


        RoundedRenderer.drawRound(
                context,
                x,
                y,
                width,
                height,
                8,
                ColorUtil.DARK_BACKGROUND
        );

    }





    /*
     * Акцентная синяя полоска
     * стиль Midpoint
     */
    public static void drawAccent(
            DrawContext context,
            float x,
            float y,
            float width
    ) {


        GradientRenderer.horizontal(
                context,
                (int) x,
                (int) y,
                (int) width,
                2,
                ColorUtil.MIDPOINT_BLUE,
                ColorUtil.MIDPOINT_LIGHT_BLUE
        );

    }





    /*
     * Текстовый стиль Midpoint
     */
    public static void drawText(
            DrawContext context,
            String text,
            float x,
            float y
    ) {


        TextRenderer.drawShadow(
                context,
                text,
                x,
                y,
                ColorUtil.WHITE
        );

    }



    /*
     * Проверка позиции мыши
     * понадобится для Drag HUD
     */
    public static boolean isHovered(
            double mouseX,
            double mouseY,
            float x,
            float y,
            float width,
            float height
    ) {


        return mouseX >= x &&
                mouseX <= x + width &&
                mouseY >= y &&
                mouseY <= y + height;

    }

}
