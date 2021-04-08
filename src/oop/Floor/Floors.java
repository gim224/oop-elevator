package oop.Floor;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Floors {
    private final List<Floor> floors;

    public Floors(List<Floor> floors) {
        validateDuplicate(floors);
        this.floors = floors;
    }

    private void validateDuplicate(List<Floor> floors) {

    }

    public List<Floor> getFloors() {
        return floors;
    }

}
