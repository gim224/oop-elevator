package oop.Button;

import oop.Elevator.Elevator;

/** 내부버튼 */
public abstract class InnerButton implements Pressiable {

    private Elevator elevator;
    private ButtonState buttonState;

    public InnerButton(Elevator elevator) {
        this.elevator = elevator;
        this.buttonState = StateDeactive.getInstance();
    }

    public void setButtonState(ButtonState buttonState) {
        this.buttonState = buttonState;
    }

    public Elevator getElevator() {
        return elevator;
    }

}
