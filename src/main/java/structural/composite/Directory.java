package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements File {
    private final String name;
    private final List<File> childs = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public List<File> getChilds() {
        return childs;
    }

    public void addChildFile(File file) {
        childs.add(file);
    }
}
