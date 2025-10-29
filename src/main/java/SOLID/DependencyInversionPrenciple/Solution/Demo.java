package SOLID.DependencyInversionPrenciple.Solution;

public class Demo {
    public static void main(String args[]){
        Laptop laptop = new Laptop(new WirelessMouse(), new WiredKeyBoard());
    }
}
