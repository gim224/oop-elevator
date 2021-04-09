package oop.Elevator;

public class StateMoveToDown implements ElevatorState {
    private static StateMoveToDown stateMoveToDown = new StateMoveToDown();

    private StateMoveToDown() {
    }

    public static StateMoveToDown getInstance() {
        return stateMoveToDown;
    }
}
