	import java.util.Scanner;
public class Day41 {
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    
        System.out.print("Masukkan total belanja: Rp ");
        double total = input.nextDouble();
        double diskon = 0;
        double totalBayar;

        if (total >= 500000) {
            diskon = 0.20;
        } else if (total >= 300000 && total <= 499999) {
            diskon = 0.10;
        } else {
            diskon = 0.0;
        }

        totalBayar = total - (total * diskon);

        System.out.println("Total belanja: Rp " + total);
        System.out.println("Diskon: " + (diskon * 100) + "%");
        System.out.println("Total yang harus dibayar: Rp " + totalBayar);
}
}
