package creational.abstractfactory;

import lombok.val;

public class Demo {
    public static void main(String[] args) {
        val client = configureClient();
        client.paint();
    }

    private static Client configureClient() {
        val factory = new WindowsWidgetFactory();
        return  new Client(factory);
    }
}
