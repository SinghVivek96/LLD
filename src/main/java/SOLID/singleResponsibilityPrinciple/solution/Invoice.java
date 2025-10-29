package SOLID.singleResponsibilityPrinciple.solution;

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
}
