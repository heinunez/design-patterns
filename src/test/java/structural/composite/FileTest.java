package structural.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class FileTest {

    @Test
    public void givenSomeFilesWhenUsingDirectoriesThenAllLooksGood() {
        File textFile = new TextFile("text_file.txt");
        File anotherTextFile = new TextFile("another_text_file.txt");
        Directory someDirectory = new Directory("some_directory");
        someDirectory.addChildFile(textFile);
        someDirectory.addChildFile(anotherTextFile);
        Directory anotherDirectory = new Directory("another_directory");
        someDirectory.addChildFile(anotherDirectory);

        assertEquals(3, someDirectory.getChildren().size());
        assertEquals("another_directory", someDirectory.getChildren().get(2).getName());
        assertInstanceOf(File.class, someDirectory.getChildren().get(0));
        assertInstanceOf(File.class, someDirectory.getChildren().get(1));
        assertInstanceOf(Directory.class, someDirectory.getChildren().get(2));
    }
}