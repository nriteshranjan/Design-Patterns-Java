package Structural.Adapter;

public class CelsiusReporter { // adaptee -> This is not my class but part of an API so we cannot modify this!
    private double tempInC;

    public double getTempInC() {
        return tempInC;
    }

    public void setTempInC(double tempInC) {
        this.tempInC = tempInC;
    }
}
