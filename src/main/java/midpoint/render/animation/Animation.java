package midpoint.render.animation;


public class Animation {


    private double value;

    private double target;

    private final double speed;



    public Animation(double speed) {

        this.speed = speed;

    }



    public void update() {

        value += (target - value) * speed;

    }



    public void setTarget(double target) {

        this.target = target;

    }



    public double getValue() {

        return value;

    }


}
