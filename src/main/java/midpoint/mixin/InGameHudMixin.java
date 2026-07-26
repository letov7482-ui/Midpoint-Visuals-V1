package midpoint.mixin;

import midpoint.hud.Huds;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.RenderTickCounter;
import net.minecraft.client.gui.hud.InGameHud;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


@Mixin(InGameHud.class)
public class InGameHudMixin {

    @Inject(
            method = "render",
            at = @At("TAIL")
    )
    private void renderMidpointHud(
            DrawContext context,
            RenderTickCounter tickCounter,
            CallbackInfo ci
    ) {

        Huds.MANAGER.renderAll(context);

    }

}
