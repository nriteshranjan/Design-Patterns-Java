package Structural.Adapter;

public class AdapterMain {
    public static void main(String[] args) {
//        CelsiusReporter cr = new CelsiusReporter();
//        cr.setTempInC(34.5);
//
//        System.out.println("Temperature in celsius: " + cr.getTempInC());

//        TempAdapter reporter = new TempClassAdapter();
        TempAdapter reporter = AdapterFactory.getAdapter("class");
        reporter.setTempInC(34.5);
        System.out.println("Temperature in Celsius: " + reporter.getTempInC());
        System.out.println("Temperature in Fahrenheit: " + reporter.getTempInF());
        System.out.println("===============================    ");

        reporter.setTempInF(94.1);
        System.out.println("Temperature in Celsius: " + reporter.getTempInC());
        System.out.println("Temperature in Fahrenheit: " + reporter.getTempInF());
    }
}
