import java.util.Scanner;
public class Day50 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
        
        String hasil = (angka%2 == 0)? "Genap" : "Ganjil";
        System.out.println(hasil);
    }
}
