package midpoint.hud;

public abstract class HudElement {


    private final String name;

    private float x;
    private float y;

    private boolean enabled = true;


    public HudElement(
            String name,
            float x,
            float y
    ) {

        this.name = name;
        this.x = x;
        this.y = y;

    }


    public abstract void render();


    public String getName() {

        return name;

    }


    public float getX() {

        return x;

    }


    public float getY() {

        return y;

    }


    public void setPosition(
            float x,
            float y
    ) {

        this.x = x;
        this.y = y;

    }


    public boolean isEnabled() {

        return enabled;

    }


    public void setEnabled(
            boolean enabled
    ) {

        this.enabled = enabled;

    }

}
