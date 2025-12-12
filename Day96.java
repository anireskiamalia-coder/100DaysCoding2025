package pkg100daysofcoding;
import java.util.Scanner;
public class Day96 {
    public static int tambah(int a, int b) {
        return a + b;
    }
    public static int kurang(int a, int b) {
        return a - b;
    }
    public static int kali(int a, int b) {
        return a * b;
    }
    public static double bagi(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int x = sc.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int y = sc.nextInt();

        System.out.println("Hasil Penjumlahan: " + tambah(x, y));
        System.out.println("Hasil Pengurangan: " + kurang(x, y));
        System.out.println("Hasil Perkalian  : " + kali(x, y));
        System.out.println("Hasil Pembagian  : " + bagi(x, y));
    }
}
