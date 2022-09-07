package structural.bridge.abstraction;

import lombok.extern.slf4j.Slf4j;
import lombok.val;
import structural.bridge.impl.ComputerImpl;

@Slf4j
public class Server extends Computer {

    public Server(ComputerImpl computerImpl) {
        super(computerImpl);
    }

    @Override
    public void update() {
        log.info("updating server");
        log.info("do server stuff");
        val sites = computerImpl.getUpdateSites();
        sites.forEach(site -> computerImpl.updateComponent(site));
    }
}
