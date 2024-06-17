package Behavioural.Command;

public class CommandMain {
    public static void main(String[] args) {
        Utility util = new Utility();
        NumberCommand nc = new NumberCommand(util, 10, 20);
        StringCommand sc = new StringCommand(util, "Ritesh");
        Invoker invoker = new Invoker();
        invoker.setCommand(nc);
        invoker.go();
        invoker.setCommand(sc);
        invoker.go();
    }
}
