import java.util.Scanner;

public class Day58{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan N: ");
        int N = input.nextInt();

        System.out.println("\nMencetak angka 1 sampai " + N + ":");
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nMencetak angka " + N + " sampai 1:");
        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}
