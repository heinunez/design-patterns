package structural.proxy;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class FolderTest {

    @Test()
    public void proxyTest() {
        Folder folder = new FolderProxy("heiner");
        folder.performOperation();
    }

    @Test()
    public void proxyUnauthorizedTest() {
        assertThrows(RuntimeException.class, () -> {
            Folder folder = new FolderProxy("admin");
            folder.performOperation();
        });
    }
}