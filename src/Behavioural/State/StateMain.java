package Behavioural.State;

import java.util.Scanner;

public class StateMain {
    public static void main(String[] args) {
        CeilingFan fan = new CeilingFan();
        Scanner sc = new Scanner(System.in);
        System.out.println("Keep pressing enter to simulate knob rotation");
        while (true) {
            sc.nextLine();
            fan.rotateKnob();
        }
    }
}
