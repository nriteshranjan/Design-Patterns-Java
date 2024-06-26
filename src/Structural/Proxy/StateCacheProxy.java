package Structural.Proxy;

import java.util.HashMap;
import java.util.Map;

public class StateCacheProxy implements States {

    StatesUtil util = new StatesUtil();
    Map<String, String> capitals = new HashMap<>();

    @Override
    public String getCapital(String state) {
        if (capitals.containsKey(state)) {
            System.out.println("Got from cache!");
            return capitals.get(state);
        }
        String capital = util.getCapital(state);
        capitals.put(state, capital);
        return capital;
    }
}
