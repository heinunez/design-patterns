package behavioral.mediator.concrete;

import behavioral.mediator.DialogDirector;
import behavioral.mediator.Widget;
import lombok.Getter;

public class FontDialogDirector implements DialogDirector {
    private Button ok;
    private Button cancel;
    private ListBox fontList;
    private EntryField fontName;

    @Getter
    private boolean opened = true;

    @Getter
    private boolean saved = false;

    @Override
    public void createWidgets() {
        ok = new Button(this);
        cancel = new Button(this);
        fontList = new ListBox(this);
        fontName = new EntryField(this);
    }

    @Override
    public void widgetChanged(Widget widget) {
        if (widget == fontList) {
            fontName.setText(fontList.getSelected());
        } else if (widget == ok) {
            saved = true;
        } else if (widget == cancel) {
            opened = false;
        }
    }

    public String getFontName() {
        return fontName.getText();
    }

    // simulate interaction
    public void changeFontSelection(){
        fontList.changed();
    }

    public void pressOkButton(){
        ok.click();
    }

    public void pressCancelButton(){
        cancel.click();
    }

}
