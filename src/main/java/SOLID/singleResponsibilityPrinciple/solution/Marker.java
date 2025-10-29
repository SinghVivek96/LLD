package SOLID.singleResponsibilityPrinciple.solution;

import lombok.AllArgsConstructor;
import lombok.Data;

//As per SOLID Principles, class should be responsible for single action. (A CLASS SHOULD HAVE ONLY ONE REASON TO CHANGE)
@Data
@AllArgsConstructor
class Marker {
    private String name;
    private String color;
    private Integer yom;
    private Integer price;
}
