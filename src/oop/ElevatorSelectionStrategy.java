package oop;

import java.util.List;

/** 가장 최적의 엘레베이터를 고르는 전략 */
public interface ElevatorSelectionStrategy {
    Elevator chooseTheMostSuitablElevator(List<Elevator> elevators);
}
