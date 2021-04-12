package oop.Button;

import oop.Floor.Floor;

public class StateDeactive implements ButtonState {

    private static ButtonState stateDeactive = new StateDeactive();

    private StateDeactive() {
    }

    public static ButtonState getInstance() {
        return stateDeactive;
    }

    @Override
    public void handle(Floor floor) {
        // TODO Auto-generated method stub

    }

}
