package SOLID.openAndClosePrinciple.solution;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class InvoiceSaveService {
    private Invoice invoice;

    public void saveInvoice(persistSolution persistSolution){
        //Logic to save
    }
}
