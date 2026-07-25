package midpoint.hud;


import java.util.ArrayList;
import java.util.List;


public class HudManager {


    private final List<HudElement> elements =
            new ArrayList<>();



    public void register(
            HudElement element
    ) {

        elements.add(element);

    }



    public void renderAll() {


        for (HudElement element : elements) {


            if (element.isEnabled()) {

                element.render();

            }

        }

    }



    public List<HudElement> getElements() {

        return elements;

    }

}
