package structural.bridge.abstraction;

import structural.bridge.impl.ComputerImpl;

public abstract class Computer {
    protected ComputerImpl computerImpl;

    protected Computer(ComputerImpl computerImpl) {
        this.computerImpl = computerImpl;
    }

    public abstract void update();
}
