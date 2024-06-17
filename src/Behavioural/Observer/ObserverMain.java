package Behavioural.Observer;

public class ObserverMain {
    public static void main(String[] args) {
        NumberStore store = new NumberStore();
        Observer obs1 = new DisplayObserver();
        Observer obs2 = new AccumulateObserver();
        store.addObserver(obs1);
        store.addObserver(obs2);
        store.setNumber(10);
        store.setNumber(20);
        store.setNumber(30);
        store.setNumber(40);

//        ((AccumulateObserver)obs2).showAllValues();
    }
}
