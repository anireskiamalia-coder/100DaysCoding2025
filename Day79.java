package pkg100daysofcoding;
import java.util.Scanner;

public class Day79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String USN_BENAR = "Ara ara";
        final String PASS_BENAR = "12345";

        String user;
        String pass;

        
        while (true) {
            System.out.print("Masukkan username: ");
            user = sc.nextLine();

            System.out.print("Masukkan password: ");
            pass = sc.nextLine();

            if (user.equals(USN_BENAR) && pass.equals(PASS_BENAR)) {
                System.out.println("Login berhasil!");
                break;
            } else {
                System.out.println("Username atau password salah. Coba lagi.\n");
            }
    }
    }
}
