package oop.Button;

import oop.Building.Floor;
import oop.Elevator.Elevator;

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
