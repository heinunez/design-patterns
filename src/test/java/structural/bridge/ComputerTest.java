package structural.bridge;

import org.junit.jupiter.api.Test;
import structural.bridge.abstraction.Computer;
import structural.bridge.abstraction.Desktop;
import structural.bridge.abstraction.Server;
import structural.bridge.impl.DellComputer;
import structural.bridge.impl.HPComputer;

class ComputerTest {

    @Test
    public void givenADesktopComputerWhenIsDellImplementationThenUpdateIsOk() {
        Computer desktop = new Desktop(new DellComputer());
        desktop.update();
    }

    @Test
    public void givenAServerComputerWhenIsHPImplementationThenUpdateIsOk() {
        Computer server = new Server(new HPComputer());
        server.update();
    }
}