package pkg100daysofcoding;

import java.util.Scanner;

public class day89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();
        sapaNama(nama);
    }
    public static void sapaNama(String nama){
        System.out.println("Halo, "+nama+". Selamat datang di Java");
    }
}
