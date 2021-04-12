package oop.pulley;

public interface PullyState {
    public void wind(Pully pully);

    public void unwind(Pully pully);

    public void wait(Pully pully);
}
