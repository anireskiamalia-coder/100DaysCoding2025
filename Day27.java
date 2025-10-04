import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   
        int N = input.nextInt();
        
        final double PI = 3.14159;
        double luas = PI * N * N;

        System.out.printf("Jari-jari %d adalah %.2f\n", N, luas);
