package oop.Button;

import oop.Building.Floor;

public class StateActive implements ButtonState {

    private static ButtonState stateActive = new StateActive();

    private StateActive() {
    }

    public static ButtonState getInstance() {
        return stateActive;
    }

    @Override
    public void handle(Floor floor) {
        // TODO Auto-generated method stub

    }

}
