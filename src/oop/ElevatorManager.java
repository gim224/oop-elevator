package oop;

import java.util.List;

/** 엘레베이터관리 */
public class ElevatorManager {
    private final List<Elevator> elevators;

    public ElevatorManager(List<Elevator> elevators) {
        this.elevators = elevators;
    }

    public void moveElevatorAt(int floor, ElevatorSelectionStrategy elevatorSelectionStrategy) {
        Elevator theMostSuitablElevator = elevatorSelectionStrategy.chooseTheMostSuitablElevator(elevators);
        theMostSuitablElevator.moveTo(floor);
    }
}
