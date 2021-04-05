import java.util.ArrayList;
import java.util.List;

import oop.Elevator;
import oop.ElevatorManager;
import oop.ElevatorSelectionStrategy;

public class Client {
    public static void main(String[] args) throws Exception {
        final int ELEVATOR_COUNT = 5;
        List<Elevator> elevators = new ArrayList<>(ELEVATOR_COUNT);

        for (int i = 0; i < ELEVATOR_COUNT; i++) {
            elevators.add(new Elevator(i, "엘리베이터" + i));
        }

        ElevatorManager elevatorManager = new ElevatorManager(elevators);
        elevatorManager.moveElevatorAt(3, new ElevatorSelectionStrategy() {

            @Override
            public Elevator chooseTheMostSuitablElevator(List<Elevator> elevators) {
                return elevators.get(elevators.size() - 1);
            }

        });

    }
}
