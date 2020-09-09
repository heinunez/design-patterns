package creational.abstractfactory;

public class WindowsWidgetFactory implements WidgetFactory {

    @Override
    public ScrollBar createScrollBar() {
        return new WindowsScrollBar();
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
