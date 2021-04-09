package oop.Floor;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Floors {
    private static final int FIRST_FLOOR = 1;

    private final List<Floor> floors;

    public Floors(List<Floor> floors) {
        validateDuplicate(floors);
        this.floors = floors;
    }

    private void validateDuplicate(List<Floor> floors) {
        Set<Integer> s = floors.stream().map(floor -> floor.getFloor()).collect(Collectors.toSet());

        if (s.size() != floors.size()) {
            throw new IllegalArgumentException("층은 중복될 수 없습니다.");
        }
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public Floor getFirstFloor() {
        return floors.stream().filter(floor -> floor.getFloor() == FIRST_FLOOR).findFirst()
                .orElseThrow(() -> new IllegalArgumentException("1층이 없을 수 없습니다."));
    }

}
