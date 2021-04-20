package oop.Button;

public class ActiveOuterButtonState implements ButtonState {

    private static volatile ButtonState buttonState = new ActiveOuterButtonState();

    private ActiveOuterButtonState() {
        // do nothing
    }

    public static ButtonState getInstance() {
        return buttonState;
    }

    @Override
    public ButtonState active() {
        try {
            throw new IllegalAccessException("외부버튼은 이미 활성상태입니다.");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;

    }

    @Override
    public ButtonState deactive() {
        //// turnOffLamp.. pauseElevator..
        return DeactiveOuterButtonState.getInstance();
    }

}
