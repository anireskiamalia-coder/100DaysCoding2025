package pkg100daysofcoding;
import java.util.Scanner;
public class Day66_polaVertikal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas: ");
        int batas = input.nextInt();

        for (int i = 1; i <= batas; i++) {
            System.out.println("*");
        }

    }
}
