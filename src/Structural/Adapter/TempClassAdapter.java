package Structural.Adapter;

public class TempClassAdapter extends CelsiusReporter implements TempAdapter { // Note: No data is getting stored here! // This form uses java inheritance and extends the source interface.
    @Override
    public double getTempInC() { // NOTE: super never refers interface
        return super.getTempInC();
    }

    @Override
    public void setTempInC(double tempInC) {
        super.setTempInC(tempInC);
    }

    @Override
    public double getTempInF() {
        return CtoF(super.getTempInC());
    }

    @Override
    public void setTempInF(double tempInF) {
        super.setTempInC(FtoC(tempInF));
    }

    private double CtoF(double tempInC) {
        return tempInC * 9 / 5 + 32;
    }

    private double FtoC(double tempInF) {
        return (tempInF - 32) * 5 / 9;

    }
}
