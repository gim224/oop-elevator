package oop.Elevator;

public class StateStop implements ElevatorState {
    private static ElevatorState stateStop = new StateStop();

    private StateStop() {
    }

    public static ElevatorState getInstance() {
        return stateStop;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub

    }
}
