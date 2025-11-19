import java.util.Scanner;

public class Day73 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = 1;
        int total = 0;

        while (angka > 0) {
            System.out.print("Masukkan angka (angka negatif untuk berhenti): ");
            angka = input.nextInt();

            if (angka < 0) {
                break;
            }

            total += angka;
        }

        System.out.println("Total penjumlahan: " + total);
    }
}
