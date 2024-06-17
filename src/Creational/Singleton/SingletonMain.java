package Creational.Singleton;

public class SingletonMain {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance(); // how the object is created or which object we will get is completely unknown to the client code. It only knows about the abstract or interface itself.
        logger.writeMessage("Application started");
        method1();
        logger.writeMessage("Calling addNumbers method");
        int result = addNumbers(10, 20);
        logger.writeMessage("Result " + result + " received from addNumbers method");
        logger.writeMessage("Application completed");
    }

    public static void method1() {
        Logger log = Logger.getInstance();
        log.writeMessage("method1 is called");
        // some code
        log.writeMessage("method1 is completed");
    }

    public static int addNumbers(int a, int b) {
        Logger log = Logger.getInstance();
        log.writeMessage("addNumbers method is called with values a = " + a + " and b = " + b );
        return a + b;
    }
}
