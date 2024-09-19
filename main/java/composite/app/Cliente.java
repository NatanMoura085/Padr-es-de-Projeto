package composite.app;

import composite.model.File;
import composite.model.FileSystem;
import composite.model.Folder;

import java.util.Arrays;

public class Cliente {
    public static void main(String[] args) {
        FileSystem file = new File("Txt.file");
        FileSystem file2 = new File("Txt.file");
        FileSystem folder = new Folder("folder", Arrays.asList(file, file2));

        folder.print(">");

    }
}
