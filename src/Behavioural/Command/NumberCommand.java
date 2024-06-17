package Behavioural.Command;

public class NumberCommand implements Command {
    // THIS PART IS NOT COMPLETELY KNOW, AND IS DEPENDENT ON CLIENT
    Utility util; // receiver
    int num1; // args
    int num2; // args

    public NumberCommand(Utility util, int num1, int num2) {
        this.util = util;
        this.num1 = num1;
        this.num2 = num2;
    }
    //=============================================================

    @Override
    public void execute() {
        util.addNumbers(num1, num2);
    }
}
