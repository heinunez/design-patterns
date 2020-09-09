package creational.abstractfactory;

import lombok.extern.java.Log;

@Log
public class MacOSScrollBar implements ScrollBar {
    @Override
    public void paint() {
        log.info("This is a Mac OS ScrollBar");
    }
}
