package oop.Button;

public class OuterButton implements Pressable {
    public enum OuterButtonDirection {
        UP, DOWN
    };

    private Integer id;
    private OuterButtonDirection outerButtonDirection;
    private OuterButtonGroup outerButtonGroup;
    private ButtonState buttonState;

    public OuterButton(Integer id, OuterButtonDirection outerButtonDirection, OuterButtonGroup outerButtonGroup) {
        this.id = id;
        this.outerButtonDirection = outerButtonDirection;
        this.outerButtonGroup = outerButtonGroup;
        this.buttonState = DeactiveOuterButtonState.getInstance();
    }

    private void setOuterButtonState(ButtonState buttonState) {
        this.buttonState = buttonState;
    }

    @Override
    public void press() {
        setOuterButtonState(buttonState.active());
    }

    @Override
    public void release() {
        setOuterButtonState(buttonState.deactive());
    }

}
