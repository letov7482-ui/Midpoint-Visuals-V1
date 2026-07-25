package midpoint.hud.elements;

import midpoint.font.Fonts;
import midpoint.hud.HudElement;
import midpoint.render.ui.RoundedRenderer;
import midpoint.theme.Theme;
import midpoint.core.Managers;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;


public class Watermark extends HudElement {


    public Watermark() {

        super(
                "Watermark",
                10,
                10
        );

    }


    @Override
    public void render() {

        MinecraftClient client =
                MinecraftClient.getInstance();


        if (client.player == null) {
            return;
        }


        DrawContext context =
                client.inGameHud.getContext();


        Theme theme =
                Managers.THEME.getCurrentTheme();


        String text =
                "Midpoint Visuals  v0.1.0";


        float width =
                Fonts.DEFAULT.getWidth(text) + 20;


        RoundedRenderer.drawRoundedRect(
                context,
                getX(),
                getY(),
                width,
                22,
                8,
                theme.getSecondaryColor()
        );


        Fonts.DEFAULT.draw(
                context,
                text,
                getX() + 10,
                getY() + 7,
                theme.getPrimaryColor()
        );

    }

}
