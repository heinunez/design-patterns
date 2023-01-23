package structural.proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RealFolder implements Folder{
    @Override
    public void performOperation() {
        log.info("Performing operation in real folder");
    }
}
