package oop.Button;

public class ActiveOuterButtonState implements OuterButtonState {

    private static volatile OuterButtonState outerButtonState = new ActiveOuterButtonState();

    private ActiveOuterButtonState() {
        // do nothing
    }

    public static OuterButtonState getInstance() {
        return outerButtonState;
    }

    @Override
    public OuterButtonState active(OuterButtonGroup outerButtonGroup) {
        try {
            throw new IllegalAccessException("외부버튼은 이미 활성상태입니다.");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;

    }

    @Override
    public OuterButtonState deactive(OuterButtonGroup outerButtonGroup) {
        outerButtonGroup.cancelElevator();
        return ActiveOuterButtonState.getInstance();
    }

}
