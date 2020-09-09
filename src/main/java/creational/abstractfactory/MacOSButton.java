package creational.abstractfactory;

import lombok.extern.java.Log;

@Log
public class MacOSButton implements Button {
    @Override
    public void paint() {
        log.info("This is a Mac OS Button");
    }
}
