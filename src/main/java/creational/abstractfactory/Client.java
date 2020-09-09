package creational.abstractfactory;

public class Client {
    private Button button;
    private ScrollBar scrollBar;

    public Client(WidgetFactory factory) {
        this.button = factory.createButton();
        this.scrollBar = factory.createScrollBar();
    }

    public void paint() {
        button.paint();
        scrollBar.paint();
    }
}
