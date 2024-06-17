package Behavioural.State;

public class OffState implements State {
    @Override
    public void changeState(CeilingFan fan) {
        fan.setState(new LowSpeedState());
        fan.runWithLowSpeed();
    }
}
