package behavioral.templatemethod;

import behavioral.templatemethod.concrete.JSONDataProcessor;
import behavioral.templatemethod.concrete.XMLDataProcessor;
import org.junit.jupiter.api.Test;

class DataProcessorTest {

    @Test
    public void dataProcessorTest() {
        DataProcessor xmlProcessor = new XMLDataProcessor();
        xmlProcessor.process("file.xml");

        DataProcessor jsonProcessor = new JSONDataProcessor();
        jsonProcessor.process("file.json");
    }

}