package oop.Elevator;

public class Elevator {

    private int id;
    private String name;
    private int currentFloor;
    private ElevatorState elevatorState;

    public Elevator(int id, String name) {
        this(id, name, 1);
    }

    public Elevator(int id, String name, int currentFloor) {
        this.id = id;
        this.name = name;
        this.currentFloor = currentFloor;
        this.elevatorState = new ElevatorStateStop();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setElevatorState(ElevatorState elevatorState) {
        this.elevatorState = elevatorState;
    }

    /** 도착 층으로 이동하라. */
    public void moveTo(int destinationFloor) {
        System.out.printf("elevatorId: %2d, currentFloor: %2d, destinationFloor: %2d\n", id, currentFloor,
                destinationFloor);

        currentFloor = destinationFloor;
    }

}
