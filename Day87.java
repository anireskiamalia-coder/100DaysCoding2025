
package pkg100daysofcoding;

import java.util.Scanner;

public class Day87 {
    public static void main(String[] args) {
        int[] angka = {10, 25, 30, 45, 50};
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka yang ingin dicari: ");
        int cariAngka = sc.nextInt();

        boolean ditemukan = false;
        int posisi = -1;

        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == cariAngka) {
                ditemukan = true;
                posisi = i;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Angka " + cariAngka + " ditemukan pada indeks ke-" + posisi);
        } else {
            System.out.println("Angka " + cariAngka + " tidak ada dalam array");
        }
    }
}
