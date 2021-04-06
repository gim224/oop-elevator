import java.util.ArrayList;
import java.util.List;

import oop.Elevator;
import oop.ElevatorManager;
import oop.ElevatorSelectionStrategy;
import oop.Elevators;

public class Client {
    public static void main(String[] args) throws Exception {
        final int ELEVATOR_COUNT = 5;
        List<Elevator> elevatorList = new ArrayList<>(ELEVATOR_COUNT);

        for (int i = 0; i < ELEVATOR_COUNT; i++) {
            elevatorList.add(new Elevator(i, "엘리베이터" + i));
        }

        Elevators elevators = new Elevators(elevatorList);

        ElevatorManager elevatorManager = new ElevatorManager(elevators);
        elevatorManager.moveElevatorAt(3, new ElevatorSelectionStrategy() {

            @Override
            public Elevator chooseTheMostSuitablElevator(Elevators elevators) {
                List<Elevator> elevatorList = elevators.getElevators();
                return elevatorList.get(elevatorList.size() - 1);
            }

        });

    }
}
