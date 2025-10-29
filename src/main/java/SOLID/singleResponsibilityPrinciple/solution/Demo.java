package SOLID.singleResponsibilityPrinciple.solution;

public class Demo {
    public static void main(String args[]){
        Invoice invoice = new Invoice(new Marker("Reynolds", "Blue", 2025, 50), 10);
        InvoiceDAO invoiceDAO = new InvoiceDAO(invoice);
        InvoicePrint invoicePrint = new InvoicePrint(invoice);
        invoice.calculateTotal();
        invoiceDAO.saveToDB();
        invoicePrint.printInvoice();
    }
}
