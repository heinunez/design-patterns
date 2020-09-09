package creational.abstractfactory;

import lombok.extern.java.Log;

@Log
public class WindowsButton implements Button {
    @Override
    public void paint() {
        log.info("This is a Windows Button");
    }
}
