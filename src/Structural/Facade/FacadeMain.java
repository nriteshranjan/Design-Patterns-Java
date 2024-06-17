package Structural.Facade;

public class FacadeMain {
    public static void main(String[] args) {
        ProductFacade pf = new ProductFacade();
        boolean b = pf.isItemBelowRL(100);
        if (b) {
            System.out.println("Product qty is below comfortable level");
        } else {
            System.out.println("Product qty is OK");

        }

    }
}
