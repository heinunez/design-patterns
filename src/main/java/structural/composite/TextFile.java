package structural.composite;

public class TextFile implements File {
    private final String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
