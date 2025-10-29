package SOLID.DependencyInversionPrenciple.violation;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Laptop {
    private final WiredMouse wiredMouse;
    private final WiredKeyBoard wiredKeyBoard;
    List<Integer> list = new ArrayList<>();
}
