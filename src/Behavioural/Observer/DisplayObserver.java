package Behavioural.Observer;

public class DisplayObserver implements Observer {
    @Override
    public void processChange(int n) {
        System.out.println("Received notification: " + n + " from the NumberStore");
    }
}
