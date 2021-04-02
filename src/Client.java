import java.util.ArrayList;
import java.util.List;

import oop.Elevator;

public class Client {
    public static void main(String[] args) throws Exception {
        final int ELEVATOR_COUNT = 5;
        List<Elevator> elevators = new ArrayList<>(ELEVATOR_COUNT);

        for (int i = 0; i < ELEVATOR_COUNT; i++) {
            elevators.add(new Elevator(i, "엘리베이터" + i));
        }

        elevators.get(0).pressedButton(4);
    }
}
