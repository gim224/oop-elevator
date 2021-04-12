package oop.Elevator;

import oop.pulley.Pully;

public class Elevator {

    private int id;
    private String name;
    private int currentFloor;

    private Pully pully;
    private ElevatorState elevatorState;

    public Elevator(int id, String name) {
        this(id, name, 1);
    }

    public Elevator(int id, String name, int currentFloor) {
        this.id = id;
        this.name = name;
        this.currentFloor = currentFloor;
        this.elevatorState = StateStop.getInstance();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setElevatorState(ElevatorState elevatorState) {
        this.elevatorState = elevatorState;
    }

    /** 도착 층으로 이동하라. */
    public void moveTo(int destinationFloor) {
        // pully.wind(destinationFloor);
        System.out.printf("elevatorId: %2d, currentFloor: %2d, destinationFloor: %2d\n", id, currentFloor,
                destinationFloor);

        currentFloor = destinationFloor;
    }

}
