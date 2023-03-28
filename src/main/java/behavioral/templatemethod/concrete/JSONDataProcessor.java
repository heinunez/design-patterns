package behavioral.templatemethod.concrete;

import behavioral.templatemethod.DataProcessor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JSONDataProcessor extends DataProcessor {
    @Override
    protected void load(String filename) {
        log.info("load json file {}", filename);
    }

    @Override
    protected void transform(String filename) {
        log.info("transform json file {}", filename);
    }

    @Override
    protected void save(String filename) {
        log.info("save json file {}", filename);
    }
}
