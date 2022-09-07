package structural.bridge.abstraction;

import lombok.extern.slf4j.Slf4j;
import lombok.val;
import structural.bridge.impl.ComputerImpl;

@Slf4j
public class Desktop extends Computer {

    public Desktop(ComputerImpl computerImpl) {
        super(computerImpl);
    }

    @Override
    public void update() {
        log.info("updating desktop");
        log.info("do desktop stuff");
        val sites = computerImpl.getUpdateSites();
        sites.forEach(site -> computerImpl.updateComponent(site));
    }
}
