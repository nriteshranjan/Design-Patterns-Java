package Behavioural.Observer;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class AccumulateObserver implements Observer {
    //    List<Integer> list = new ArrayList<>();
    PrintStream ps;

    public AccumulateObserver() {
        super();
        try {
            ps = new PrintStream("src/Behavioural/Observer/resources/numbers.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //    @Override
    public void processChange(int n) {
        ps.println(n);
    }

//    public void showAllValues() {
//        System.out.println("Saved values in the Accumulate Observer: ");
//        for (Integer i : list) {
//            System.out.println(i);
//        }
//    }
}
