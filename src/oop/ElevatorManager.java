package oop;

/** 엘레베이터관리 */
public class ElevatorManager {
    Elevators elevators;

    public ElevatorManager(Elevators elevators) {
        this.elevators = elevators;
    }

    public void moveElevatorAt(int floor, ElevatorSelectionStrategy elevatorSelectionStrategy) {
        Elevator theMostSuitablElevator = elevatorSelectionStrategy.chooseTheMostSuitablElevator(elevators);
        theMostSuitablElevator.moveTo(floor);
    }
}
