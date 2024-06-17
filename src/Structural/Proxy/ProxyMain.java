package Structural.Proxy;

public class ProxyMain {
    public static void main(String[] args) {
        States st = new StateCacheProxy();
        System.out.println(st.getCapital("DELHI"));
        System.out.println(st.getCapital("PUNJAB"));
        System.out.println(st.getCapital("DELHI"));
    }
}
