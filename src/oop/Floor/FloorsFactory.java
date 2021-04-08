package oop.Floor;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FloorsFactory {

    public static final int MIN_FLOOR = -4;
    public static final int MAX_FLOOR = 16;

    public Floors createFloors() {
        return new Floors(IntStream.rangeClosed(MIN_FLOOR, MAX_FLOOR).boxed().filter(i -> i != 0).map(Floor::new)
                .collect(Collectors.toList()));
    }

}
