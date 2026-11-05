package src.Advanced.io;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

public class IoNioAndNio2 {

    // BUFFER STREAM to read and write in bytes - abstract classes
    public static void write(OutputStream out, byte[] bytes) throws IOException {
        out.write(bytes);
    }
    public static byte[] read(InputStream in) throws IOException {
        return in.readAllBytes();
    }

    // BUFFER STREAM - to transfer datas
    public static void transfer(InputStream in, OutputStream out) throws IOException {
        // 1KB=1024B (size of buffer)
        byte[] buffer = new byte[1024];

        while (true) {

            // read bytes (storage in buffer)
            int bytesRead = in.read(buffer);

            System.out.println(bytesRead);
            if (bytesRead < 0) break;


            // write bytes (buffer), 0=start, bytesRead.length
            out.write(buffer, 0, bytesRead);
        }

    }

    static void main() throws IOException {

        Path file = Path.of("src", "io", "files", "text.txt");
        Path file2 = Path.of("src", "io", "files", "text2.txt");

        // OUT - to write something
        FileWriter fw = new FileWriter(file.toFile(), Charset.defaultCharset());
        fw.write("Hi, friend, gordon!");
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

        // FILE STREAM - to manipulate files (param File)
        FileInputStream fir = new FileInputStream(file.toFile());
        FileOutputStream fow = new FileOutputStream(file2.toFile());
        fow.write(fir.readAllBytes());

        // INPUT/OUTPUT STREAM - to read bytes
        InputStream in = new ByteArrayInputStream("Hello, my new friend!".getBytes());
        OutputStream out = new FileOutputStream(file2.toFile());

        transfer(in, out);

        // INPUT STREAM -> Reader
        InputStreamReader isr = new InputStreamReader(
                new ByteArrayInputStream("Hello, my new friend!!!".getBytes()),
                StandardCharsets.UTF_8
        );
        BufferedReader br2 = new BufferedReader(isr);
        String text2 = br2.readLine();
        System.out.println(text2);

        // OUTPUT STREAM -> Writer
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        OutputStreamWriter osr = new OutputStreamWriter(bytes);
        osr.write(text2);
        System.out.println(bytes);

        // PRINT WRITER - to writing
        PrintWriter pw = new PrintWriter(file.toFile());

        pw.println("a-b-c-d-e-f");
        pw.println("g-h-i-j-k-l");
        pw.print("m-n-o-p-q-r");

        // flush to force the exit (needs to close)
        pw.flush();

        // SCANNER - to reading
        Scanner sc = new Scanner(file.toFile());

        // scanner can have delimiter
        sc.useDelimiter("-");

        while (sc.hasNextLine()) {
            System.out.print(sc.next());
        }
        sc.close();

        // SYSTEM.IN -> InputStream
        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("DIGIT SOMETHING: ");
        String text3 = br3.readLine();
        br3.close();

        BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file.toFile())));
        bw2.write(text3);
        bw2.flush();
    }
}
