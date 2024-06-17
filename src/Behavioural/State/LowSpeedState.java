package Behavioural.State;

public class LowSpeedState implements State {
    @Override
    public void changeState(CeilingFan fan) {
        fan.setState(new MediumSpeedState());
        fan.runWithMediumSpeed();
    }
}
