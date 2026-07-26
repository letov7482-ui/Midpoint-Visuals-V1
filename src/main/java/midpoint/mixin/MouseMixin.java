@Mixin(Screen.class)
public class MouseMixin {


@Inject(
method="mouseClicked",
at=@At("HEAD"),
cancellable=true
)
private void click(
double mouseX,
double mouseY,
int button,
CallbackInfoReturnable<Boolean> cir
){

    HudEditor.mouseClicked(mouseX, mouseY);

}


@Inject(
method="mouseDragged",
at=@At("HEAD")
)
private void drag(
double mouseX,
double mouseY,
int button,
double deltaX,
double deltaY,
CallbackInfoReturnable<Boolean> cir
){

    HudEditor.mouseDragged(mouseX, mouseY);

}


@Inject(
method="mouseReleased",
at=@At("HEAD")
)
private void release(
double mouseX,
double mouseY,
int button,
CallbackInfoReturnable<Boolean> cir
){

    HudEditor.mouseReleased();

}

}
