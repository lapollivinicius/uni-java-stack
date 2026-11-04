package src.Advanced.exercises.exercise_69;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;

public class Main {

    public static void createFile() throws IOException {
        Path tempDir = Path.of("src", "exercises", "exercise_69", "temp");
        String nameFile = String.format("file_%d.txt", System.currentTimeMillis());
        Files.createDirectories(tempDir);
        Files.createFile(tempDir.resolve(nameFile));
        System.out.println(tempDir.resolve(nameFile));
    }

    static void main() throws IOException {
        createFile();
    }

}
