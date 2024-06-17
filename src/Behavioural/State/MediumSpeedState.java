package Behavioural.State;

public class MediumSpeedState implements State {
    @Override
    public void changeState(CeilingFan fan) {
        fan.setState(new HighSpeedState());
        fan.runWithHighSpeed();
    }
}
