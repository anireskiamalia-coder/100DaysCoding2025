import java.util.Scanner;

public class Day78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sebuah teks: ");
        String teks = sc.nextLine();

        System.out.println("\n=== HASIL PEMROSESAN STRING ===");
        
        System.out.println("Panjang teks (length): " + teks.length());
        System.out.println("toUpperCase: " + teks.toUpperCase());
        System.out.println("toLowerCase: " + teks.toLowerCase());
        System.out.println("Trim : [" + teks.trim() + "]");
            System.out.println("Substring(0, 2): " + teks.substring(0, 2));

        System.out.println("Replace :" + teks.replace('a', 'x'));
        System.out.println("contains: " + teks.contains("Java"));
        System.out.println("startsWith: " + teks.startsWith("Hello"));
        System.out.println("endsWith: " + teks.endsWith("!"));

        

        
    }
}
