import java.util.Scanner;

public class Day70 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan panjng: ");
        int panjang = in.nextInt();
        System.out.print("Masukkan lebar : ");
        int lebar = in.nextInt();
        
        for (int i = 0; i < panjang; i++) {
            for(int j = 0; j < lebar; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
