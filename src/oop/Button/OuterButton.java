package oop.Button;

public class OuterButton implements Pressiable {
    public enum OuterButtonDirection {
        UP, DOWN
    };

    private Integer id;
    private OuterButtonDirection outerButtonDirection;
    private OuterButtonGroup outerButtonGroup;
    private OuterButtonState outerButtonState;

    public OuterButton(Integer id, OuterButtonDirection outerButtonDirection, OuterButtonGroup outerButtonGroup) {
        this.id = id;
        this.outerButtonDirection = outerButtonDirection;
        this.outerButtonGroup = outerButtonGroup;
        this.outerButtonState = DeactiveOuterButtonState.getInstance();
    }

    private void setOuterButtonState(OuterButtonState outerButtonState) {
        this.outerButtonState = outerButtonState;
    }

    @Override
    public void press() {
        setOuterButtonState(outerButtonState.active(outerButtonGroup));
    }

    @Override
    public void release() {
        setOuterButtonState(outerButtonState.deactive(outerButtonGroup));
    }

}
