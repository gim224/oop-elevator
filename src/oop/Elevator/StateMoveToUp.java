package oop.Elevator;

public class StateMoveToUp implements ElevatorState {
    private static StateMoveToUp stateMoveToUp = new StateMoveToUp();

    private StateMoveToUp() {
    }

    public static StateMoveToUp getInstance() {
        return stateMoveToUp;
    }

}
