package pkg100daysofcoding;
import java.util.Scanner;
public class Day98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        System.out.print("Deret Fibonacci: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
    }
}
    
