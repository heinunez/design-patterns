package creational.builder;

import lombok.Data;

@Data
public class Sandwich {
    private String bread;
    private String spread;
    private String filling;

    public String giveMeAll() {
        return bread + filling + spread + bread;
    }
}
