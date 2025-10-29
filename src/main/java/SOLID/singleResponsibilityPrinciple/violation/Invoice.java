package SOLID.singleResponsibilityPrinciple.violation;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class Invoice {
    private Marker marker;
    private Integer quantity;

//    1ST RESPONSIBILITY
    public Integer calculateTotal(){
        return this.quantity * this.marker.getPrice();
    }

//    2ND RESPONSIBILITY
    public void printInvoice(){
        System.out.println("Total Quantity " + this.quantity +  " Unit Price " + this.marker.getPrice() +  " Total Price " + calculateTotal());
    }

//    3RD RESPONSIBILITY
    public void saveToDB(){
        //Some logic to save to DB
    }
}
