package SOLID.DependencyInversionPrenciple.Solution;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Laptop {
    private final Mouse mouse;
    private final Keyboard keyboard;
}
