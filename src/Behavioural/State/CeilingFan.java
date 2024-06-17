package Behavioural.State;

public class CeilingFan {
    private State state;

    public CeilingFan() {
        state = new OffState();
    }

    public void rotateKnob() {
        state.changeState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public void switchOff() {
        System.out.println("Fan is switched off");
    }

    public void runWithLowSpeed() {
        System.out.println("Fan is running with low speed");
    }

    public void runWithMediumSpeed() {
        System.out.println("Fan is running with medium speed");
    }

    public void runWithHighSpeed() {
        System.out.println("Fan is running with high speed");
    }
}
