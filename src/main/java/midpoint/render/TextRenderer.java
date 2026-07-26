package midpoint.render;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;


public class TextRenderer {


    private TextRenderer() {
        // utility class
    }



    private static TextRenderer getMinecraftTextRenderer() {

        return MinecraftClient
                .getInstance()
                .textRenderer;

    }




    /*
     * Обычный текст
     */
    public static void draw(
            DrawContext context,
            String text,
            float x,
            float y,
            int color
    ) {


        context.drawText(
                getMinecraftTextRenderer(),
                text,
                (int) x,
                (int) y,
                color,
                true
        );


    }





    /*
     * Текст с тенью
     * для красивого HUD
     */
    public static void drawShadow(
            DrawContext context,
            String text,
            float x,
            float y,
            int color
    ) {


        context.drawTextWithShadow(
                getMinecraftTextRenderer(),
                text,
                (int) x,
                (int) y,
                color
        );


    }





    /*
     * Получить ширину текста
     * нужно для центровки HUD
     */
    public static int width(
            String text
    ) {

        return getMinecraftTextRenderer()
                .getWidth(text);

    }





    /*
     * Высота шрифта
     */
    public static int height() {

        return getMinecraftTextRenderer()
                .fontHeight;

    }


}
