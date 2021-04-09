package oop.pulley;

import oop.Elevator.Elevator;
import oop.Elevator.StateMoveToDown;
import oop.Elevator.StateMoveToUp;

public class Pully implements Runnable {

    private int id;
    private Elevator elevator;

    public Pully(int id, Elevator elevator) {
        this.id = id;
        this.elevator = elevator;
    }

    /* 감아라 */
    public void wind() {
        elevator.setElevatorState(StateMoveToUp.getInstance());
    }

    /* 풀러라 */
    public void unwind() {
        elevator.setElevatorState(StateMoveToDown.getInstance());
    }

    @Override
    public void run() {

    }

}
