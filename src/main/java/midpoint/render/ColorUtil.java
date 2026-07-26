package midpoint.render;


public class ColorUtil {


    private ColorUtil() {
        // utility class
    }



    /*
     * Midpoint основной синий цвет
     */
    public static final int MIDPOINT_BLUE = 0xFF4AA8FF;


    /*
     * Более светлый синий для градиентов
     */
    public static final int MIDPOINT_LIGHT_BLUE = 0xFF7BC7FF;



    /*
     * Белый текст
     */
    public static final int WHITE = 0xFFFFFFFF;



    /*
     * Тёмный фон HUD
     */
    public static final int DARK_BACKGROUND = 0xB0101118;



    /*
     * Меняет прозрачность цвета
     */
    public static int withAlpha(
            int color,
            int alpha
    ) {

        alpha = Math.max(0, Math.min(255, alpha));

        return (color & 0x00FFFFFF)
                | (alpha << 24);

    }




    /*
     * Смешивание двух цветов
     */
    public static int blend(
            int color1,
            int color2,
            float progress
    ) {


        progress = Math.max(
                0,
                Math.min(1, progress)
        );


        int a1 = (color1 >> 24) & 255;
        int r1 = (color1 >> 16) & 255;
        int g1 = (color1 >> 8) & 255;
        int b1 = color1 & 255;



        int a2 = (color2 >> 24) & 255;
        int r2 = (color2 >> 16) & 255;
        int g2 = (color2 >> 8) & 255;
        int b2 = color2 & 255;



        int a = (int)(a1 + (a2 - a1) * progress);
        int r = (int)(r1 + (r2 - r1) * progress);
        int g = (int)(g1 + (g2 - g1) * progress);
        int b = (int)(b1 + (b2 - b1) * progress);



        return (a << 24)
                | (r << 16)
                | (g << 8)
                | b;

    }



    /*
     * Плавный переход цвета туда-обратно
     * для анимаций
     */
    public static int pulse(
            int first,
            int second,
            float time
    ) {


        float value =
                (float)
                ((Math.sin(time) + 1) / 2);


        return blend(
                first,
                second,
                value
        );

    }

}
