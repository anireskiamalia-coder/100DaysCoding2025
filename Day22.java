import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int s, L;
        System.out.print("Masukkan sisi : ");
        s = input.nextInt();
        L = s*s;
        
        
        System.out.println("L = s x s ");
        System.out.println("L = "+s+" x "+s);
        System.out.println("L = "+L);
          }
}
