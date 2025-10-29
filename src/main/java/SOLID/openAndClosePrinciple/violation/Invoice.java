package SOLID.openAndClosePrinciple.violation;

public class Invoice {
    private Marker marker;
    private Integer quantity;

    public Integer calculateTotal(){
        return this.quantity * this.marker.getPrice();
    }
}
