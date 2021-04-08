package oop.Button;

import oop.Elevator.Elevator;
import oop.Floor.Floor;

public class NumberButton extends InnerButton {

    private Floor floor;

    public NumberButton(Floor floor, Elevator elevator) {
        super(elevator);
        this.floor = floor;
    }

    @Override
    public void press() {
        super.getElevator().moveTo(floor.getFloor());
    }
}
