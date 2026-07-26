package midpoint.hud;

import midpoint.hud.element.HudElement;

public class HudEditor {

    private static boolean editing = false;

    private static HudElement dragging;

    private static float offsetX;
    private static float offsetY;


    public static void enable() {
        editing = true;
    }


    public static void disable() {
        editing = false;
        dragging = null;
    }


    public static boolean isEditing() {
        return editing;
    }


    public static void mouseClicked(double mouseX, double mouseY) {

        if (!editing)
            return;


        for (HudElement element : Huds.MANAGER.getElements()) {

            if (mouseX >= element.getX()
                    && mouseX <= element.getX() + 150
                    && mouseY >= element.getY()
                    && mouseY <= element.getY() + 20) {


                dragging = element;

                offsetX = (float) mouseX - element.getX();
                offsetY = (float) mouseY - element.getY();

                break;
            }
        }
    }


    public static void mouseDragged(double mouseX, double mouseY) {

        if (dragging == null)
            return;


        dragging.setPosition(
                (float) mouseX - offsetX,
                (float) mouseY - offsetY
        );
    }


    public static void mouseReleased() {

        dragging = null;

    }
}
