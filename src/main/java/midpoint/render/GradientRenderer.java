package midpoint.render;

import net.minecraft.client.gui.DrawContext;


public class GradientRenderer {


    private GradientRenderer() {
        // utility class
    }



    public static void horizontal(
            DrawContext context,
            int x,
            int y,
            int width,
            int height,
            int leftColor,
            int rightColor
    ) {


        for (int i = 0; i < width; i++) {


            float progress =
                    (float) i / width;


            int color =
                    ColorUtil.blend(
                            leftColor,
                            rightColor,
                            progress
                    );


            context.fill(
                    x + i,
                    y,
                    x + i + 1,
                    y + height,
                    color
            );

        }

    }




    public static void vertical(
            DrawContext context,
            int x,
            int y,
            int width,
            int height,
            int topColor,
            int bottomColor
    ) {


        for (int i = 0; i < height; i++) {


            float progress =
                    (float) i / height;


            int color =
                    ColorUtil.blend(
                            topColor,
                            bottomColor,
                            progress
                    );


            context.fill(
                    x,
                    y + i,
                    x + width,
                    y + i + 1,
                    color
            );

        }

    }

}
