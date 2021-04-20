package oop.Button;

public class DeactiveOuterButtonState implements ButtonState {

    private static volatile ButtonState buttonState = new DeactiveOuterButtonState();

    private DeactiveOuterButtonState() {
        // do nothing
    }

    public static ButtonState getInstance() {
        return buttonState;
    }

    @Override
    public ButtonState active() {
        // callElevator.. turnOnLamp
        return ActiveOuterButtonState.getInstance();
    }

    @Override
    public ButtonState deactive() {
        try {
            throw new IllegalAccessException("외부버튼은 이미 비활성상태입니다.");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}
