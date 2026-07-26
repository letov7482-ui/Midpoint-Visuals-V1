package midpoint.mixin;


import midpoint.hud.HudEditor;
import midpoint.hud.config.HudConfig;


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
    private void openEditor(CallbackInfo ci) {


        HudEditor.enable();


    }





    @Inject(
            method = "removed",
            at = @At("TAIL")
    )
    private void closeEditor(CallbackInfo ci) {


        HudEditor.disable();


        HudConfig.save();


    }


}
