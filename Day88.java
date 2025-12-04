package pkg100daysofcoding;

import java.util.Scanner;

public class Day88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] angka = {10, 25, 30, 45, 50};
        System.out.print("MAsukkan angka yang ingin dicari: ");
        int cari = sc.nextInt();

        boolean ketemu = false;

        for (int a : angka) {
            if (a == cari) {
                ketemu = true;
                break;
            }
        }

        if (ketemu) {
            System.out.println("Angka " + cari + " ditemukan dalam array.");
        } else {
            System.out.println("Angka " + cari + " tidak ditemukan.");
        }
    }
    
}
