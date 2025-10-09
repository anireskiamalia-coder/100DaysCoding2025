package pkg100daysofcoding;
import java.util.Scanner;
public class Day31_LogikaOr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai ujian: ");
        int ujian = input.nextInt();
        
        System.out.print("Masukkan nilai praktik: ");
        int praktik = input.nextInt();
     
        boolean lulus = (ujian >= 70) || (praktik >= 70);
        
        System.out.println("Status kelulusan: " + lulus);
        
        
        
    }
}


