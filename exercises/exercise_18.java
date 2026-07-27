package exercises;

import java.util.Scanner;

public class exercise_18 {

    public static void main(String[] args) {

        // 1MB = 8mb
        Scanner scan = new Scanner(System.in);

        System.out.print("Download size (MB): ");
        double downloadSizeMB = scan.nextDouble();

        System.out.print("Speed Download (mbps): ");
        double speedDownloadMbps = scan.nextDouble();

        double timeDownloadMinutes = Math.ceil(((downloadSizeMB * 8) / speedDownloadMbps) / 60) ;

        System.out.println(timeDownloadMinutes + " min approximately");

    }

}
