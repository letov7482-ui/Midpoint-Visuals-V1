package midpoint.hud;

import net.minecraft.client.MinecraftClient;


public class HudEditor {


    private boolean dragging = false;


    private HudElement selected;


    private float offsetX;
    private float offsetY;



    public void mouseClicked(
            double mouseX,
            double mouseY,
            int button
    ) {


        if (button != 0) {
            return;
        }



        for (HudElement element :
                Huds.MANAGER.getElements()) {


            float x = element.getX();
            float y = element.getY();



            if (isInside(
                    mouseX,
                    mouseY,
                    x,
                    y,
                    170,
                    45
            )) {


                selected = element;

                dragging = true;


                offsetX =
                        (float) mouseX - x;


                offsetY =
                        (float) mouseY - y;


                break;

            }

        }

    }





    public void mouseDragged(
            double mouseX,
            double mouseY
    ) {


        if (!dragging || selected == null) {
            return;
        }



        selected.setPosition(
                (float) mouseX - offsetX,
                (float) mouseY - offsetY
        );

    }





    public void mouseReleased() {

        dragging = false;

        selected = null;

    }





    private boolean isInside(
            double mouseX,
            double mouseY,
            float x,
            float y,
            float width,
            float height
    ) {


        return mouseX >= x &&
                mouseX <= x + width &&
                mouseY >= y &&
                mouseY <= y + height;

    }


}
