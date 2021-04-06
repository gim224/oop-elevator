package oop;

/** 가장 최적의 엘레베이터를 고르는 전략 */
public interface ElevatorSelectionStrategy {
    Elevator chooseTheMostSuitablElevator(Elevators elevators);
}
