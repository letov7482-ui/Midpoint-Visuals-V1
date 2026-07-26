package midpoint.mixin;

import midpoint.hud.HudEditor;

import net.minecraft.client.gui.screen.ChatScreen;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


@Mixin(ChatScreen.class)
public class ChatScreenMixin {


    private static final HudEditor HUD_EDITOR =
            new HudEditor();



    @Inject(
            method = "mouseClicked",
            at = @At("HEAD")
    )
    private void onMouseClicked(
            double mouseX,
            double mouseY,
            int button,
            CallbackInfo ci
    ) {


        HUD_EDITOR.mouseClicked(
                mouseX,
                mouseY,
                button
        );

    }



    @Inject(
            method = "mouseDragged",
            at = @At("HEAD")
    )
    private void onMouseDragged(
            double mouseX,
            double mouseY,
            int button,
            double deltaX,
            double deltaY,
            CallbackInfo ci
    ) {


        HUD_EDITOR.mouseDragged(
                mouseX,
                mouseY
        );

    }



    @Inject(
            method = "mouseReleased",
            at = @At("HEAD")
    )
    private void onMouseReleased(
            double mouseX,
            double mouseY,
            int button,
            CallbackInfo ci
    ) {


        HUD_EDITOR.mouseReleased();

    }

}
