package midpoint.hud.elements;

import midpoint.hud.HudElement;
import midpoint.render.RenderUtil;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;


public class Watermark extends HudElement {


    private float x = 20;
    private float y = 20;


    private final float width = 170;
    private final float height = 45;



    public Watermark() {

        super(
                "Watermark"
        );

    }



    @Override
    public void render(
            DrawContext context
    ) {


        MinecraftClient client =
                MinecraftClient.getInstance();



        int fps =
                client.getCurrentFps();



        int ping = 0;


        /*
         * Пока временно.
         * Потом подключим настоящий ping
         * через NetworkHandler.
         */



        String title =
                "Midpoint Visuals";


        String info =
                fps + " FPS • "
                + ping
                + " ms";



        /*
         * Панель
         */

        RenderUtil.drawPanel(
                context,
                x,
                y,
                width,
                height
        );



        /*
         * Синяя полоска сверху
         */

        RenderUtil.drawAccent(
                context,
                x,
                y,
                width
        );



        /*
         * Название
         */

        RenderUtil.drawText(
                context,
                title,
                x + 10,
                y + 10
        );



        /*
         * FPS + Ping
         */

        RenderUtil.drawText(
                context,
                info,
                x + 10,
                y + 25
        );


    }



    @Override
    public float getX() {

        return x;

    }



    @Override
    public float getY() {

        return y;

    }



    @Override
    public void setPosition(
            float x,
            float y
    ) {

        this.x = x;
        this.y = y;

    }


}
