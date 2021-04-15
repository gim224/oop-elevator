import java.util.ArrayList;
import java.util.List;

import oop.Building.Building;
import oop.Button.OuterButton;
import oop.Button.OuterButtonGroup;

public class Client {
    public static void main(String[] args) throws Exception {
        Building building = new Building();

        List<OuterButton> outerButtons = new ArrayList<>();

        for (int i = 0; i < building.getFloors().getFloors().size(); i++) {
            for (int j = 0; j < 2; j++) {
                OuterButtonGroup outerButtonGroup = new OuterButtonGroup(i * 10 + j,
                        building.getFloors().getFloors().get(i));
                OuterButton outerUpButton = new OuterButton(j, OuterButton.OuterButtonDirection.UP, outerButtonGroup);
                OuterButton outerDownButton = new OuterButton(j, OuterButton.OuterButtonDirection.DOWN,
                        outerButtonGroup);

                outerButtons.add(outerUpButton);
                outerButtons.add(outerDownButton);
            }
        }

        outerButtons.get(0).press();
    }
}
