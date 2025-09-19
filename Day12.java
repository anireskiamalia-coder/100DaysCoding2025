import java.util.Scanner;
public class main {
  public static void main(String[] args) {
        Scanner biodata = new Scanner(System.in);
        
        String nama,hobi,alamat,ttl;
        int umur;
        
        System.out.print("Masukkan nama : ");
        nama = biodata.nextLine();
        System.out.print("Masukkan alamat : ");
        alamat = biodata.nextLine();
        System.out.print("Masukkan tanggal lahir : ");
        ttl = biodata.nextLine();
        System.out.print("Masukkan hobi : ");
        hobi = biodata.nextLine();
        System.out.print("Masukkan umur : ");
        umur = biodata.nextInt();
                
        System.out.println("\n==== BIODATA SAYA ====");
        System.out.println("Nama \t\t: "+nama);
        System.out.println("Alamat \t\t: "+alamat);
        System.out.println("Tanggal lahir \t: "+ttl);
        System.out.println("Umuur \t\t: "+umur+ " tahun");
        System.out.println("Hobi \t\t: "+hobi);
       
        
        
  }
}
