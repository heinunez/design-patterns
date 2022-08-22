package creational.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public void doSomething(){
        System.out.println("Hello");
    }

    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}
