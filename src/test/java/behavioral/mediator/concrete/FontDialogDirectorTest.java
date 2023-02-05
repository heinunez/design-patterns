package behavioral.mediator.concrete;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FontDialogDirectorTest {

    @Test
    public void mediatorTest() {
        FontDialogDirector director = new FontDialogDirector();
        director.createWidgets();

        director.changeFontSelection();
        assertEquals("Arial", director.getFontName());

        director.pressOkButton();
        assertTrue(director.isSaved());

        director.pressCancelButton();
        assertFalse(director.isOpened());
    }

}