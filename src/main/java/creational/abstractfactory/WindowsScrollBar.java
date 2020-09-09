package creational.abstractfactory;

import lombok.extern.java.Log;

@Log
public class WindowsScrollBar implements ScrollBar {
    @Override
    public void paint() {
        log.info("This is a Windows ScrollBar");
    }
}
