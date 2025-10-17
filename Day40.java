import java.util.Scanner;
public class main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.println("===KALKULATOR SEDERHANA===");
        System.out.print("Masukkan angka: ");
        int a = in.nextInt();
        in.nextLine();
        System.out.print("Masukkan operator(+,-,/,*): ");
        String op = in.nextLine();
        System.out.print("Masukkan angka: ");
        int b = in.nextInt();
        
        int c = 0;
        if (op.equals("+")) {
            c = a+b;
            System.out.println("Hasil penjumlahan: "+c);
        }
        else if (op.equals("-")) {
            c = a-b;
            System.out.println("Hasil pengurangan: "+c);
        }
        else if (op.equals("/")) {
            c = a/b;
            System.out.println("Hasil pembagian: "+c);
        }
        else if (op.equals("*")) {
            c = a*b;
            System.out.println("Hasil perkalian: "+c);
        }
        else {
            System.out.println("Tidak valid!");
        }
        
        
    
}
}
