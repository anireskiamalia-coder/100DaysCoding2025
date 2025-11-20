package javaapplication48;
    import java.util.Scanner;
    public class JavaApplication48 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("=== MENU MAKANAN ===");
            System.out.println("1. Ayam Goreng");
            System.out.println("2. Ayam Geprek");
            System.out.println("3. Ayam Suwir");
            System.out.println("4. Ayam Bakar");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Kamu memilih Ayam Goreng.");
                    break;

                case 2:
                    System.out.println("Kamu memilih Ayam Geprek.");
                    break;

                case 3:
                    System.out.println("Kamu memilih Ayam Suwir.");
                    break;

                case 4:
                    System.out.println("Kamu memilih Ayam Bakar.");
                    break;

                case 5:
                    System.out.println("Keluar dari menu makanan.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");
            }

            System.out.println();
        } while (pilihan != 5);
    }
}
