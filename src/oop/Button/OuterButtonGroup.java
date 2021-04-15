package oop.Button;

import oop.Building.Floor;

public class OuterButtonGroup {
    private Integer id;
    private Floor floor;

    public OuterButtonGroup(Integer id, Floor floor) {
        this.id = id;
        this.floor = floor;
    }

    public void callElevator() {
        System.out.println(floor + "엘베를 불러라");
    }

    public void cancelElevator() {
        System.out.println(floor + "엘베를 취소해라.");
    }
}
