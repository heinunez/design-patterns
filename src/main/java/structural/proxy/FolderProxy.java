package structural.proxy;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class FolderProxy implements Folder {
    private Folder realFolder;
    private final String username;

    @Override
    public void performOperation() {
        if (!username.equals("heiner"))
            throw new RuntimeException("Access denied");

        if (realFolder == null) {
            realFolder = new RealFolder();
        }
        realFolder.performOperation();
    }
}
