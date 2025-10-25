import java.util.Scanner;

public class kalkulatorSwithcase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, hasil;
        char operator;

        System.out.println("=== MENU KALKULATOR ===");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");
        System.out.print("Pilih operasi (1-4): ");
        int pilihan = input.nextInt();

        System.out.print("Masukkan angka pertama: ");
        a = input.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        b = input.nextDouble();

        switch (pilihan) {
            case 1:
                hasil = a + b;
                System.out.println("Hasil: " + hasil);
                break;
            case 2:
                hasil = a - b;
                System.out.println("Hasil: " + hasil);
                break;
            case 3:
                hasil = a * b;
                System.out.println("Hasil: " + hasil);
                break;
            case 4:
                hasil = a / b;
                System.out.println("Hasil: " + hasil);
            default:
                System.out.println("Pilihan tidak valid!");
                break;
        }

        
    }
}
