import java.util.Scanner;

public class gajibersih{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan gaji pokok: ");
        double gajiPokok = input.nextDouble();
        
        System.out.print("Masukkan tunjangan: ");
        double tunjangan = input.nextDouble();
        
        System.out.print("Masukkan pajak (dalam persen): ");
        double pajakPersen = input.nextDouble();
        
        System.out.print("Masukkan potongan tetap: ");
        double potonganTetap = input.nextDouble();
        
        double gajiKotor = gajiPokok + tunjangan;
        double pajak = (pajakPersen / 100) * gajiKotor;
        double gajiBersih = gajiKotor - pajak - potonganTetap;
        
        System.out.println("Gaji Kotor: " + gajiKotor);
        System.out.println("Pajak: " + pajak);
        System.out.println("Potongan Tetap: " + potonganTetap);
        System.out.println("Gaji Bersih: " + gajiBersih);

        
    }
}
