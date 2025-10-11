package pkg100daysofcoding;
import java.util.Scanner;
public class Day34_kombinasiOperator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai tugas: ");
        double nilaiTugas = input.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        double nilaiUjian = input.nextDouble();
        double rataRata = (nilaiTugas + nilaiUjian) / 2;
        boolean lulus = (rataRata >= 70) && (nilaiTugas >= 50) && (nilaiUjian >= 50);

        if (lulus) {
            System.out.println("Selamat! Anda LULUS.");
        } else {
            System.out.println("Maaf, Anda TIDAK LULUS.");
        }

        System.out.println("Rata-rata nilai Anda: " + rataRata);
        
    }
}
