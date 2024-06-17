package Behavioural.ChainOfResponsibility;

import java.util.Scanner;

public class ChainOfResponsibilityMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to dispense:");
        int amount = sc.nextInt();
        ATMMachine machine = new ATMMachine();
        machine.dispense(amount);

    }
}
