package oop.Building;

public class Building {
    private final Floors floors = FloorsFactory.createFloors();
    // private final List<Passage> passages;

    public Floors getFloors() {
        return floors;
    }
}
