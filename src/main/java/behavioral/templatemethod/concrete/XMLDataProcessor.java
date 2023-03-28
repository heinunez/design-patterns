package behavioral.templatemethod.concrete;

import behavioral.templatemethod.DataProcessor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class XMLDataProcessor extends DataProcessor {
    @Override
    protected void load(String filename) {
        log.info("load xml file {}", filename);
    }

    @Override
    protected void transform(String filename) {
        log.info("transform xml file {}", filename);
    }

    @Override
    protected void save(String filename) {
        log.info("save xml file {}", filename);
    }
}
