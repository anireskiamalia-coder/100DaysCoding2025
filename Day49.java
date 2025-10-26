import java.util.Scanner;

public class day49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();
        
        String hasil = (nilai >= 80) ? "Lulus" : "Tidak Lulus";

        System.out.println("Nilai : " + nilai);
        System.out.println("Status: " + hasil);
    }
}
