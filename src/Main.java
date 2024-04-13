import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the amount of mbps: ");
        int megaBitPerSecond = scan.nextInt();

        int kiloBits = megaBitPerSecond * 125;

        double megaBytePerSecond =  Double.valueOf(kiloBits) / 1000;

        System.out.println(megaBitPerSecond + "Mbps = " + megaBytePerSecond + "MBs.");

    }
}
