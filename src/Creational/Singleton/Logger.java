package Creational.Singleton;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.time.LocalDateTime;

public class Logger {

    // Creational.Singleton instance variable, initialized to null
    private static Logger instance = null;
    PrintStream writer;

    // Private constructor to prevent instantiation from outside
    private Logger() {
        String now = LocalDateTime.now().toString().replaceAll(":", "-");
        String fileName = "/Users/rnahak/Desktop/Design Pattern/Design Patterns/src/Creational/Singleton/resources/logFile_" + now + ".txt";
        try {
            writer = new PrintStream(fileName);
            System.out.println("Log file " + fileName + " is created");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    // Public method to provide access to the singleton instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // Create instance if it does not exist
        }
        return instance; // Return the singleton instance
    }

    // Method to write a message to the log file
    public void writeMessage(String message) {
        writer.println(message);
    }
}
