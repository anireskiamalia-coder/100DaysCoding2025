import java.util.Scanner;
public class main {
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //input nilai
        System.out.print("Masukkan nama : ");
        String nama = input.nextLine();
        System.out.print("Masukkan inisial : ");
        char inisial = input.next().charAt(0);
        System.out.print("Masukkan umur : ");
        byte umur = input.nextByte();
        System.out.print("Masukkan tanggal lahir : ");
        int lahir = input.nextInt();
        System.out.print("Masukkan tahun lahir : ");
        long tahun = input.nextLong();
        System.out.print("Masukkan jumlah saudara : ");
        short saudara = input.nextShort();
        System.out.print("Masukkan bb : ");
        float bb = input.nextFloat();
        System.out.print("Masukkan tinggi : ");
        double tinggi = input.nextDouble();
        System.out.print("Apakah saya mahasiswa : ");
        boolean mahasiswa = input.nextBoolean();
        
        //output
        System.out.println("\nNama Saya \t: "+nama);
        System.out.println("Inisial Nama \t: "+inisial);
        System.out.println("Umur Saya \t: "+umur+" tahun");
        System.out.println("Tanggal lahir \t: "+lahir);
        System.out.println("Tahun Lahir \t: "+tahun);
        System.out.println("Jumlah Saudara \t: "+saudara);
        System.out.println("Berat Badan \t: "+bb);
        System.out.println("Tinggi Badan \t: "+tinggi);
        System.out.println("Status Mahasiswa :"+mahasiswa);
        
        
        
        
          }
}
