import java.util.List;
import java.util.stream.Collectors;

import oop.Button.InnerButton;
import oop.Button.NumberButton;
import oop.Elevator.Elevator;
import oop.Floor.Floors;
import oop.Floor.FloorsFactory;

public class Client {
    public static void main(String[] args) throws Exception {
        Floors floors = new FloorsFactory().createFloors();

        Elevator elevator = new Elevator(1, "1호기");
        List<InnerButton> buttons = floors.getFloors().stream().map(floor -> new NumberButton(floor, elevator))
                .collect(Collectors.toList());

        buttons.get(2).press();

        buttons.get(6).press();

        /*
         * buttons.forEach(button -> ); final int ELEVATOR_COUNT = 5; List<Elevator>
         * elevatorList = new ArrayList<>(ELEVATOR_COUNT);
         * 
         * for (int i = 0; i < ELEVATOR_COUNT; i++) { elevatorList.add(new Elevator(i,
         * "엘리베이터" + i)); }
         * 
         * Elevators elevators = new Elevators(elevatorList);
         * 
         * ElevatorManager elevatorManager = new ElevatorManager(elevators);
         * elevatorManager.moveElevatorAt(3, new ElevatorSelectionStrategy() {
         * 
         * @Override public Elevator chooseTheMostSuitablElevator(Elevators elevators) {
         * List<Elevator> elevatorList = elevators.getElevators(); return
         * elevatorList.get(elevatorList.size() - 1); }
         * 
         * });
         */

    }
}
