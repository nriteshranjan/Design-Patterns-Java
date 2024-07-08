package Behavioural.Observer.Example2;

import java.beans.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class PropertyChangeListenerLambdaTest {
    public static void main(String[] args) {
        // Start the application by creating an instance of PropertyChangeListenerLambdaTest
        new PropertyChangeListenerLambdaTest();
    }

    public PropertyChangeListenerLambdaTest() {
        // Create the first frame with a JLabel
        JFrame frame = new JFrame("First Frame");
        final JLabel label = new JLabel("Observing...");
        label.setFont(new Font("Dialog", Font.PLAIN, 18));
        frame.add(label);
        frame.getRootPane().setBorder(new EmptyBorder(10, 10, 10, 10));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 150);
        frame.setLocation(200, 200);
        frame.setVisible(true);

        // Create a MessageBean instance (Subject)
        MessageBean bean = new MessageBean();

        // Add a property change listener (Observer) to the bean
        // This listener updates the label when the property changes
        bean.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent e) {
                // Update the label with the new value from the event
                label.setText((String) e.getNewValue());
            }
        });

        // Create the second frame which will trigger property changes on the bean
        new Frame1(bean);
    }

    // Frame1 class represents another window that interacts with the MessageBean
    private class Frame1 {
        private int clicks;

        Frame1(MessageBean bean) {
            // Create the second frame with a JLabel
            JFrame frame = new JFrame("Second Frame");
            JLabel label = new JLabel("Click anywhere to fire a property change event");
            label.setFont(new Font("Dialog", Font.PLAIN, 18));
            frame.add(label);
            frame.getRootPane().setBorder(new EmptyBorder(10, 10, 10, 10));
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(450, 150);
            frame.setLocation(600, 200);
            frame.setVisible(true);

            // Add a mouse listener to the frame to handle click events
            frame.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    // Increment the click count and set the new value in the bean
                    String data = "Click-count [" + ++clicks + "]";
                    bean.setValue(data); // This triggers the property change event
                }
            });
        }
    }
}

// MessageBean class represents the Subject in the Observer pattern
class MessageBean {
    private final PropertyChangeSupport support = new PropertyChangeSupport(this);
    private String value;

    // Method to add a property change listener (Observer)
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    // Method to remove a property change listener (Observer)
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }

    // Getter for the current value
    public String getValue() {
        return value;
    }

    // Setter for the new value which triggers the property change event
    public void setValue(String newValue) {
        String oldValue = value;
        value = newValue;
        // Notify all registered listeners about the property change
        support.firePropertyChange("value", oldValue, newValue);
    }
}
