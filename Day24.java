import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        final double phi = 3.14;
        double L, r, d;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan r = ");
        r = input.nextDouble();
        L = phi * r * r;
        
        
        System.out.println("Luas = "+L);
}
