package Creational.Prototype;

public class PrototypeMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e1 = new Employee(101, "Ritesh", 50000);
        Employee e2 = (Employee) e1.clone();
        System.out.println(e1);
        System.out.println(e2);

        e1.addSkill("jpa");

        System.out.println(e1);
        System.out.println(e2);
    }
}
