package behavioral.templatemethod;

public abstract class DataProcessor {
    public final void process(String filename) {
        load(filename);
        transform(filename);
        save(filename);
    }

    protected abstract void save(String filename);

    protected abstract void transform(String filename);

    protected abstract void load(String filename);
}
