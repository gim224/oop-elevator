package oop.Button;

public interface OuterButtonState {
    OuterButtonState active(OuterButtonGroup outerButtonGroup);

    OuterButtonState deactive(OuterButtonGroup outerButtonGroup);
}
