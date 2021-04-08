package oop.Elevator;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Elevator {
    private final static List<Integer> BUTTON_LIST = IntStream.rangeClosed(-5, 16).boxed().filter(i -> i != 0)
            .collect(Collectors.toList());

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

    /** 도착 층으로 이동하라. */
    public void moveTo(int destinationFloor) {
        if (BUTTON_LIST.contains(destinationFloor)) {
            System.out.printf("elevatorId: %2d, currentFloor: %2d, destinationFloor: %2d\n", id, currentFloor,
                    destinationFloor);
            currentFloor = destinationFloor;
        } else {
            throw new IllegalArgumentException("도착 층이 없습니다.");
        }
    }

}
