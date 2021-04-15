package oop.Building;

public class Floor {
    private int floor;

    public Floor(int floor) {
        this.floor = floor;
    }

    public int getFloor() {
        return floor;
    }

    @Override
    public String toString() {
        return "[" + floor + "층" + "]";
    }
}
