import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama pemesan: ");
        String nama = input.nextLine();
        
        System.out.println("\n=== MENU DESSERT ===");
        System.out.println("1. Puding   - Rp 10.000");
        System.out.println("2. Donat    - Rp 15.000");
        System.out.println("3. Mochi    - Rp 12.000");
        System.out.println("4. Brownies - Rp 20.000");
        System.out.println("=====================");

        System.out.print("Pilih menu (1-4): ");
        int pilihan = input.nextInt();

        int harga = 0;
        String namaMenu = "";

        
        if (pilihan == 1) {
            namaMenu = "Puding";
            harga = 10000;
        } else if (pilihan == 2) {
            namaMenu = "Donat";
            harga = 15000;
        } else if (pilihan == 3) {
            namaMenu = "Mochi";
            harga = 12000;
        } else if (pilihan == 4) {
            namaMenu = "Brownies";
            harga = 20000;
        } else {
            System.out.println("Pilihan tidak tersedia!");
            
        }
        
        System.out.print("Masukkan jumlah pesanan: ");
        int jumlah = input.nextInt();
        
        int total = harga * jumlah;

        
        System.out.println("\n=== RINCIAN PESANAN ===");
        System.out.println("Nama Pemesan     : " + nama);
        System.out.println("Menu             : " + namaMenu);
        System.out.println("Harga Satuan     : Rp " + harga);
        System.out.println("Jumlah pesanan   : " + jumlah);
        System.out.println("------------------------");
        System.out.println("Total Bayar      : Rp " + total);
        
    
}
}
