package oop.pulley;

import oop.Elevator.Elevator;
import oop.Elevator.StateMoveToDown;
import oop.Elevator.StateMoveToUp;

public class Pully {

    private int id;
    private Elevator elevator;
    private PullyState pullyState;

    public Pully(int id, Elevator elevator) {
        this.id = id;
        this.elevator = elevator;
    }

    /* 감아라 */
    private void wind(int destinationFloor) {
        elevator.setElevatorState(StateMoveToUp.getInstance());
    }

    /* 풀러라 */
    private void unwind(int destinationFloor) {
        elevator.setElevatorState(StateMoveToDown.getInstance());
    }

}
