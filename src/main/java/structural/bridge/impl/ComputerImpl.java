package structural.bridge.impl;

import java.util.List;

public interface ComputerImpl {
    List<String> getUpdateSites();

    void updateComponent(String updateSite);
}
