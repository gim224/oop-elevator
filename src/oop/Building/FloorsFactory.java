package oop.Building;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FloorsFactory {
    private static final int MIN_FLOOR = 1;
    private static final int MAX_FLOOR = 16;

    private static volatile Floors floors = new Floors(IntStream.rangeClosed(MIN_FLOOR, MAX_FLOOR).boxed()
            .filter(i -> i != 0).map(Floor::new).collect(Collectors.toList()));

    private FloorsFactory() {

    }

    public static Floors createFloors() {
        return floors;
    }

}
