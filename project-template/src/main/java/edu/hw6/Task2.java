package edu.hw6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task2 {

    public static void cloneFile(Path path) throws IOException {
        String fileName = path.getFileName().toString();
        String baseName = fileName.substring(0, fileName.lastIndexOf('.'));
        String extension = fileName.substring(fileName.lastIndexOf('.'));

        int copyNumber = 1;
        Path copyPath;

        do {
            String copyName = baseName + " — копия" + (copyNumber == 1 ? "" : " (" + copyNumber + ")") + extension;
            copyPath = path.resolveSibling(copyName);
            copyNumber++;
        } while (Files.exists(copyPath));

        Files.copy(path, copyPath);
    }
}
