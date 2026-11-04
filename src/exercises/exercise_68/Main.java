package src.Advanced.exercises.exercise_68;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.NumberFormat;

public class Main {

    public static long calculateBytes(Path path) throws IOException {
        long totalBytes = 0;
        try (DirectoryStream<Path> files = Files.newDirectoryStream(path)) {
            for (Path file: files) {
                if (Files.isDirectory(file)) {
                    totalBytes += calculateBytes(file);
                } else {
                    totalBytes += Files.size(file);
                }
            }
        };
        return totalBytes;
    }

    static void main() throws IOException {

        long totalBytes = calculateBytes(Path.of("src", "exercises", "exercise_68"));
        System.out.println(NumberFormat.getInstance().format(totalBytes) + " Bytes");

    }


}
