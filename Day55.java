import java.util.Scanner;

public class Day55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int berat;
        int total = 0;
        
        for (int i = 0; i < N; i++) {
            berat = input.nextInt();
            total += berat;
        }
        System.out.println(total + " kg");
    }
}
