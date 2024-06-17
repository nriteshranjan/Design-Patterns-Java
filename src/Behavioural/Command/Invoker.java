package Behavioural.Command;

public class Invoker {
    Command command;

    public void setCommand(Command command) { // invoker doesn't know anything about the actual implementation of command here
        this.command = command;
    }

    public void go() { // when to execute this is dependent on the invoker
        command.execute();
    }
}
