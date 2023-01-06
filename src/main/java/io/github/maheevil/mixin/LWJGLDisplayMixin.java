package io.github.maheevil.mixin;

import org.lwjgl.opengl.Display;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Display.class)
public class LWJGLDisplayMixin {
    @Inject(
            method = "reset",
            at = @At("HEAD"),
            cancellable = true,
            remap = false
    )
    private static void displeyInject(CallbackInfo ci){
        ci.cancel();
    }
}
