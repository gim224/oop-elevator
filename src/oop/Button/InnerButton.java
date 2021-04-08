package oop.Button;

import oop.Elevator.Elevator;

/** 내부버튼 */
public abstract class InnerButton {

    private Elevator elevator; // 다중성이 적은 방향을 선택하라.
    private ButtonState buttonState;

    public InnerButton(Elevator elevator) {
        this.elevator = elevator;
        this.buttonState = new StateDeactive();
    }

    public void setButtonState(ButtonState buttonState) {
        this.buttonState = buttonState;
    }

    public Elevator getElevator() {
        return elevator;
    }

    public abstract void press();

}
