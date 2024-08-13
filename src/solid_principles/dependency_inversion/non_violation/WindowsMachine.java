package solid_principles.dependency_inversion.non_violation;

import solid_principles.dependency_inversion.non_violation.Keyboard;
import solid_principles.dependency_inversion.non_violation.Monitor;

public class WindowsMachine {

    private final Keyboard keyboard;
    private final Monitor monitor;

    public WindowsMachine(Keyboard keyboard, Monitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
}
