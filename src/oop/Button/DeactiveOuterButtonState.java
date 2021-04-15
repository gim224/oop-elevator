package oop.Button;

public class DeactiveOuterButtonState implements OuterButtonState {

    private static volatile OuterButtonState outerButtonState = new DeactiveOuterButtonState();

    private DeactiveOuterButtonState() {
        // do nothing
    }

    public static OuterButtonState getInstance() {
        return outerButtonState;
    }

    @Override
    public OuterButtonState active(OuterButtonGroup outerButtonGroup) {
        outerButtonGroup.callElevator();
        return ActiveOuterButtonState.getInstance();
    }

    @Override
    public OuterButtonState deactive(OuterButtonGroup outerButtonGroup) {
        try {
            throw new IllegalAccessException("외부버튼은 이미 비활성상태입니다.");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}
