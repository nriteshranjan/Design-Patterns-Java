package Behavioural.Command;

public class StringCommand implements Command {
    Utility util; // receiver
    String name; // args

    public StringCommand(Utility util, String name) {
        this.util = util;
        this.name = name;
    }

    @Override
    public void execute() {
        util.sayHello(name);
    }
}
