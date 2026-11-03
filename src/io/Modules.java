package src.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Modules {

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
        Path p4 = Path.of("src","io").resolve(p1);
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




    }

}
