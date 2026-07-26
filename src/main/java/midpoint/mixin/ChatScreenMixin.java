package midpoint.mixin;

import midpoint.hud.HudEditor;

import net.minecraft.client.gui.screen.ChatScreen;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


@Mixin(ChatScreen.class)
public class ChatScreenMixin {


    @Inject(
        method = "init",
        at = @At("TAIL")
    )
    private void openHudEditor(CallbackInfo ci){

        HudEditor.setEditing(true);

    }


    @Inject(
        method = "close",
        at = @At("TAIL")
    )
    private void closeHudEditor(CallbackInfo ci){

        HudEditor.setEditing(false);

    }
  }
