package midpoint.hud.elements;

import midpoint.hud.HudElement;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;

public class Watermark extends HudElement {

    private final MinecraftClient client = MinecraftClient.getInstance();

    public Watermark() {
        super("Watermark", 6, 6);
    }

    @Override
    public void render() {

        if (client.player == null) {
            return;
        }

        int x = (int) getX();
        int y = (int) getY();

        client.inGameHud.getChatHud();

        client.textRenderer.draw(
                Text.of("Midpoint Visuals"),
                x,
                y,
                0xFFFFFFFF,
                true,
                client.getBufferBuilders().getEntityVertexConsumers(),
                net.minecraft.client.render.VertexConsumerProvider.Immediate.class.cast(
                        client.getBufferBuilders().getEntityVertexConsumers()
                ),
                net.minecraft.client.render.RenderLayer.getGuiTextured(),
                0,
                0,
                0
        );
    }
}
