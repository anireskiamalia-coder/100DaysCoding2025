import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai ujian: ");
        int nilai = input.nextInt();

        if (nilai >= 75) {
            System.out.println("Lulus!");
            
            if (nilai >= 90) {
                System.out.println("Predikat A");
            } else if (nilai >= 80) {
                System.out.println("Predikat C");
            } else {
                System.out.println("Predikay D");
            }

        } else {
            System.out.println("Tidak lulus");
        
    }
}
