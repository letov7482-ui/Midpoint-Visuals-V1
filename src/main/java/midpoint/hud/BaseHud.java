package midpoint.hud;

import net.minecraft.client.MinecraftClient;

public abstract class BaseHud extends HudElement {

    protected final MinecraftClient client =
            MinecraftClient.getInstance();

    public BaseHud(
            String name,
            float x,
            float y
    ) {

        super(name, x, y);

    }

    protected boolean canRender() {

        return client != null &&
               client.player != null &&
               client.world != null;

    }

}
