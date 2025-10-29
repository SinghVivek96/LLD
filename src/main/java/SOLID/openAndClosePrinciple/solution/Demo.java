package SOLID.openAndClosePrinciple.solution;

public class Demo {
    public static void main(String args[]){
        Invoice invoice = new Invoice(new Marker("Reynolds", 100), 10);
        invoice.calculateTotal();
        new SaveToDB().save(invoice);
        new SaveToES().save(invoice);
    }
}
