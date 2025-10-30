import java.util.Scanner;

public class Day53 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;

        while (true) { 
            System.out.print("MAsukkan angka (0 untuk berhenti): ");
            angka = input.nextInt();

            if (angka == 0) {
                System.out.println("Berhenti");
                break;
            }
        }
        
        System.out.println("Program dihentikan");
    }
}
