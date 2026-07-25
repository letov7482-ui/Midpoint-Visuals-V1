package midpoint.hud.elements;

import midpoint.hud.HudElement;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;


public class Watermark extends HudElement {


    private final MinecraftClient client =
            MinecraftClient.getInstance();



    public Watermark() {

        super(
                "Watermark",
                6,
                6
        );

    }



    @Override
    public void render(
            DrawContext context
    ) {


        if (client.player == null) {

            return;

        }


        int x = (int) getX();

        int y = (int) getY();



        context.fill(
                x,
                y,
                x + 140,
                y + 22,
                0xAA101010
        );



        context.drawText(
                client.textRenderer,
                Text.of("Midpoint Visuals"),
                x + 6,
                y + 7,
                0xFFFFFFFF,
                true
        );



        context.drawText(
                client.textRenderer,
                Text.of("v1.0"),
                x + 105,
                y + 7,
                0xFF9B5CFF,
                true
        );

    }

}
