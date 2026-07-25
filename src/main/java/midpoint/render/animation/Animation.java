package midpoint.render.animation;


public class Animation {


    private double value;

    private double target;

    private final double speed;

    private Direction direction =
            Direction.FORWARDS;



    public Animation(double speed) {

        this.speed = speed;

    }



    public void update() {

        if (direction == Direction.FORWARDS) {

            value += (target - value) * speed;

        } else {

            value -= value * speed;

        }


        if (value < 0) {

            value = 0;

        }


        if (value > 1) {

            value = 1;

        }

    }



    public void setDirection(Direction direction) {

        this.direction = direction;

    }



    public void setTarget(double target) {

        this.target = target;

    }



    public double getValue() {

        return value;

    }


    public boolean isFinished() {

        return value == target;

    }

}
