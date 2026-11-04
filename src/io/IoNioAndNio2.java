package src.Advanced.io;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Path;

public class IoNioAndNio2 {

    static void main() throws IOException {

        Path file = Path.of("src", "io", "files", "text.txt");

        // OUT - to write something
        FileWriter fw = new FileWriter(file.toFile(), Charset.defaultCharset());
        fw.write("Hi, friend");
        fw.close();

        // IN - to read something
        FileReader fr = new FileReader(file.toFile(), Charset.defaultCharset());
        int c = fr.read();
        StringBuilder text = new StringBuilder();
        while (c > -1) {
            text.append((char) c);
            c = fr.read();
        }
        System.out.println(text);
        fr.close();

        // WRITER and READER classes
        Writer sw = new StringWriter();
        sw.write("Hello, writer");
        System.out.println(sw.toString());

        Reader sr = new StringReader("Hello, reader");
        System.out.println((char) sr.read());

        // BUFFERS - reader and writer
        BufferedReader br = new BufferedReader(sr); // receive a Reader
        System.out.println(br.readLine());

        BufferedWriter bw = new BufferedWriter(sw);
        bw.write("Hello, writer");
        System.out.println(bw.toString()); // it doesn't have tostring
    }

}
