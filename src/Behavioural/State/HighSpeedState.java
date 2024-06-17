package Behavioural.State;

public class HighSpeedState implements State {
    @Override
    public void changeState(CeilingFan fan) {
        fan.setState(new OffState());
        fan.switchOff();
    }
}
