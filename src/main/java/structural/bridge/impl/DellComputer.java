package structural.bridge.impl;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static java.util.Arrays.asList;

@Slf4j
public class DellComputer implements ComputerImpl {
    @Override
    public List<String> getUpdateSites() {
        return asList("dell_update_1", "dell_update_2");
    }

    @Override
    public void updateComponent(String updateSite) {
        log.info("updating dell computer from: {}", updateSite);
    }
}
