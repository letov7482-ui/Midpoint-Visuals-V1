package midpoint.hud;

import midpoint.hud.element.HudElement;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;

public class HudEditor {

    private static boolean editing = false;

    private static HudElement dragging;
    private static float offsetX;
    private static float offsetY;


    public static void setEditing(boolean value) {
        editing = value;
    }


    public static boolean isEditing() {
        return editing;
    }


    public static void mouseClicked(double mouseX, double mouseY) {

        if (!editing)
            return;


        for (HudElement element : Huds.MANAGER.getElements()) {

            if (isInside(element, mouseX, mouseY)) {

                dragging = element;

                offsetX = (float)mouseX - element.getX();
                offsetY = (float)mouseY - element.getY();

                break;
            }
        }
    }


    public static void mouseDragged(double mouseX, double mouseY) {

        if (dragging == null)
            return;


        dragging.setPosition(
                (float)mouseX - offsetX,
                (float)mouseY - offsetY
        );
    }


    public static void mouseReleased() {

        dragging = null;

    }


    private static boolean isInside(
            HudElement element,
            double mouseX,
            double mouseY
    ) {

        return mouseX >= element.getX()
                && mouseX <= element.getX()+120
                && mouseY >= element.getY()
                && mouseY <= element.getY()+20;

    }
}
