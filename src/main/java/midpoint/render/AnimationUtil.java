package midpoint.render;


public class AnimationUtil {


    private AnimationUtil() {
        // utility class
    }



    /*
     * Плавная интерполяция
     */
    public static float animate(
            float current,
            float target,
            float speed
    ) {


        float difference = target - current;


        if (Math.abs(difference) < 0.01f) {
            return target;
        }


        return current + difference * speed;

    }




    /*
     * Плавное движение с ограничением
     */
    public static double animate(
            double current,
            double target,
            double speed
    ) {


        double difference = target - current;


        if (Math.abs(difference) < 0.01) {
            return target;
        }


        return current + difference * speed;

    }




    /*
     * Ease Out анимация
     * для красивого появления GUI/HUD
     */
    public static float easeOut(
            float value
    ) {


        value = Math.max(
                0,
                Math.min(1, value)
        );


        return 1 - (1 - value) * (1 - value);

    }




    /*
     * Пульсация элемента
     * например Target ESP или Glow
     */
    public static float pulse(
            float speed
    ) {


        return (float)
                ((Math.sin(
                        System.currentTimeMillis()
                                * 0.001
                                * speed
                ) + 1) / 2);

    }




    /*
     * Линейная интерполяция
     */
    public static float lerp(
            float start,
            float end,
            float progress
    ) {


        return start +
                (end - start) * progress;

    }


}
