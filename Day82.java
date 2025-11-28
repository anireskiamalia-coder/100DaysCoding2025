package pkg100daysofcoding;

import java.util.Scanner;

public class Day82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array: ");
        int jumlah = sc.nextInt();

        int[] angka = new int[jumlah];

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan elemen ke-" + i + ": ");
            angka[i] = sc.nextInt();
        }

        for (int i = 0; i < angka.length; i++) {
            System.out.println(angka[i]);
        }
    }
    
}
