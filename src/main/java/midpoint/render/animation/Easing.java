package midpoint.render.animation;


public class Easing {


    public static double linear(double value) {

        return value;

    }


    public static double easeOut(double value) {

        return 1 - Math.pow(1 - value, 3);

    }


    public static double easeIn(double value) {

        return Math.pow(value, 3);

    }


    public static double easeInOut(double value) {

        if (value < 0.5) {

            return 4 * value * value * value;

        }

        return 1 - Math.pow(-2 * value + 2, 3) / 2;

    }

}
