import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng   - Rp15.000");
        System.out.println("2. Mie Goreng    - Rp12.000");
        System.out.println("3. Ayam Bakar    - Rp20.000");
        System.out.println("4. Es Teh        - Rp5.000");
        System.out.print("Pilih menu (1-4): ");
        int pilihan = input.nextInt();
        double harga = 0;

        switch (pilihan) {
            case 1:
                System.out.println("Nasi Goreng");
                harga= 15000;
                break;
            case 2:
                System.out.println("Mie Goreng");
                harga = 12000;
                break;
            case 3:
                System.out.println("Ayam Bakar");
                harga = 20000;
                break;
            case 4:
                System.out.println("Es Teh");
                harga = 5000;
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                
        }

        System.out.println("Harga: Rp" + harga);
        
    }
}
