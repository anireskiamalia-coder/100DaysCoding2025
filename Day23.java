import java.util.Scanner;
public class main {
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int p,l,L;
        System.out.print("Masukkan panjang = ");
        p = input.nextInt();
        System.out.print("Masukkan luas = ");
        l = input.nextInt();
        
        L = p * l;
       
        
        System.out.println("L = p x l ");
        System.out.println("L = "+p+ " + "+l);
        System.out.println("L = "+L+ " cm");
  }
}
