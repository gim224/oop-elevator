package oop;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Elevator {
    private final static List<Integer> BUTTON_LIST = IntStream.rangeClosed(-5, 16).boxed().filter(i -> i != 0)
            .collect(Collectors.toList());
    private int currentFloor = 1;

    private int id;
    private String name;

    public Elevator(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    /** 버튼을 눌러라. */
    public void pressedButton(int destinationFloor) {
        if (BUTTON_LIST.contains(destinationFloor)) {
            goToDestinationFloor(destinationFloor);
        } else {
            new IllegalArgumentException("도착 층이 없습니다.");
        }
    }

    /** 도착 층으로 이동하라. */
    private void goToDestinationFloor(int destinationFloor) {
        System.out.printf("currentFloor: %2d, destinationFloor: %2d", currentFloor, destinationFloor);
        currentFloor = destinationFloor;
    }

}
