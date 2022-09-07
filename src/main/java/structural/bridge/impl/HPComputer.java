package structural.bridge.impl;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static java.util.Arrays.asList;

@Slf4j
public class HPComputer implements ComputerImpl {
    @Override
    public List<String> getUpdateSites() {
        return asList("hp_update_1", "hp_update_2");
    }

    @Override
    public void updateComponent(String updateSite) {
        log.info("updating HP computer from: {}", updateSite);
    }
}
