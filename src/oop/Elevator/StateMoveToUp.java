package oop.Elevator;

public class StateMoveToUp implements ElevatorState {
    private static ElevatorState stateMoveToUp = new StateMoveToUp();

    private StateMoveToUp() {
    }

    public static ElevatorState getInstance() {
        return stateMoveToUp;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub

    }

}
