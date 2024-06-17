package Structural.Proxy;

public class StatesUtil implements States {
    @Override
    public String getCapital(String state) {

        // uses database to get capitals for states
        switch (state.toUpperCase()) {
            case "DELHI":
                return "Delhi";
            case "MAHARASHTRA":
                return "Mumbai";
            case "KARNATAKA":
                return "Bangalore";
            default:
                return "Unknown state";
        }
    }
}
