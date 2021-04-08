package oop.Elevator;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/* 일급컬렉션 */
public class Elevators {
    private final List<Elevator> elevators;

    public Elevators(List<Elevator> elevators) {
        validateDuplicate(elevators);
        this.elevators = elevators;
    }

    private void validateDuplicate(List<Elevator> elevators) {
        Set<Integer> nonDuplicateId = new HashSet<>(
                elevators.stream().map(elevator -> elevator.getId()).collect(Collectors.toList()));

        if (nonDuplicateId.size() != elevators.size()) {
            throw new IllegalArgumentException("엘레베이터ID는 중복될 수 없습니다.");
        }
    }

    public List<Elevator> getElevators() {
        return elevators;
    }

}
