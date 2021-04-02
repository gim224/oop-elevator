package oop;

import java.util.List;

/** 엘레베이터관리 */
public class ElevatorManager {
    private final List<Elevator> elevators;
    private ElevatorSelectionStrategy elevatorSelectionStrategy;

    public ElevatorManager(List<Elevator> elevators) {
        this.elevators = elevators;
        // this.elevatorSelectionStrategy = new RandomElevatorSelectionStrategy();
    }

    public void setElevatorSelectionStrategy(ElevatorSelectionStrategy elevatorSelectionStrategy) {
        this.elevatorSelectionStrategy = elevatorSelectionStrategy;
    }

    public void moveElevatorAt(int floor) {
        Elevator theMostSuitablElevator = elevatorSelectionStrategy.chooseTheMostSuitablElevator(elevators);
        theMostSuitablElevator.moveTo(floor);
    }
}
