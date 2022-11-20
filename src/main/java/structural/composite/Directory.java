package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements File {
    private final String name;
    private final List<File> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public List<File> getChildren() {
        return children;
    }

    public void addChildFile(File file) {
        children.add(file);
    }
}
