package creational.abstractfactory;

public class MacOSWidgetFactory implements WidgetFactory {
    @Override
    public ScrollBar createScrollBar() {
        return new MacOSScrollBar();
    }

    @Override
    public Button createButton() {
        return new MacOSButton();
    }
}
