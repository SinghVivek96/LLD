package SOLID.openAndClosePrinciple.violation;

public class InvoiceDAO {
    private Invoice invoice;

    private void saveToDB(){
        //Logic to save to DB
    }

    //New requirement came in to save it to ES

    private void saveToES(){
//        Logic to save to ES
    }

//    We violate the Open & Close Principle
}
