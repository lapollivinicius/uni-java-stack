package src.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class PathAndFiles {

    public static void main(String[] args) throws IOException {

        // PATH /Users/files/text.txt
        Path p1 = Path.of("files");
        System.out.println(p1);

        // PATH get name file
        Path p2 = p1.getFileName();
        System.out.println(p2);

        // PATH get root file
        Path p3 = p1.getRoot();
        System.out.println(p3);

        // PATH "join" paths
        Path p4 = Path.of("src", "io").resolve(p1);
        System.out.println(p4);

        // PATH get absolute path
        Path p5 = p4.toAbsolutePath();
        System.out.println(p5);

        // PATH to get parent dir
        System.out.println(p5.getParent());

        // FILES to check if a file exists
        System.out.println(Files.exists(p5));

        // FILES to check if it is a dir
        System.out.println(Files.isDirectory(p5));

        // FILES to create a dir (createDirectory - throw exception if dir exists)
        System.out.println(Files.createDirectories(p5));

        // FILES to create a file
        if (!Files.exists(p5.resolve("text.txt"))) {
            System.out.println(Files.createFile(p5.resolve("text.txt")));
        }

        // FILES to create a temp dir (needs a prefix)
        System.out.println(Files.createTempDirectory("_temp").toAbsolutePath());

        // FILES to delete a file (delete)
        // Files.deleteIfExists(p5.resolve("text.txt"));

        // FILES to copy and paste (copy have options to copy behavior)
        Files.createDirectories(p5.resolve("files_2"));
        Files.copy(p5.resolve("text.txt"), p5.resolve("files_2"), StandardCopyOption.REPLACE_EXISTING);

        // FILES to move a file
        // Files.move(from, to);

        // FILES to list dirs
        DirectoryStream<Path> files = Files.newDirectoryStream(Path.of(""), "*.md");
        for (Path file: files) {
            System.out.println(Files.isDirectory(file) ? "> " + file : file);
        }
        // needs to close
        files.close();

        // FILE class
        File file = new File("");
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.exists());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getName());


    }

}
