package midpoint.render.util;

public class ColorUtil {


    public static int rgba(
            int red,
            int green,
            int blue,
            int alpha
    ) {

        return (
                alpha << 24
                |
                red << 16
                |
                green << 8
                |
                blue
        );

    }


    public static int rgb(
            int red,
            int green,
            int blue
    ) {

        return rgba(
                red,
                green,
                blue,
                255
        );

    }


}
