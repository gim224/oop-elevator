package oop.Elevator;

public class StateMoveToDown implements ElevatorState {
    private static ElevatorState stateMoveToDown = new StateMoveToDown();

    private StateMoveToDown() {
    }

    public static ElevatorState getInstance() {
        return stateMoveToDown;
    }

    @Override
    public void execute() {

    }
}
