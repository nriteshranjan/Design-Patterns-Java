package Structural.Adapter;

public class TempObjectAdapter implements TempAdapter { // This form uses Java Composition and adapter contains the source object.
    CelsiusReporter rep = new CelsiusReporter();

    @Override
    public double getTempInC() {
        return rep.getTempInC();
    }

    @Override
    public void setTempInC(double tempInC) {
        rep.setTempInC(tempInC);
    }

    @Override
    public double getTempInF() {
        return CtoF(rep.getTempInC());
    }

    @Override
    public void setTempInF(double tempInF) {
        rep.setTempInC(FtoC(tempInF));
    }

    private double CtoF(double tempInC) {
        return tempInC * 9 / 5 + 32;
    }

    private double FtoC(double tempInF) {
        return (tempInF - 32) * 5 / 9;

    }
}
