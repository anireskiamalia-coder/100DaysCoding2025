import java.util.Scanner;
public class main {
public static void main(String[] args) {
    Scanner input = new Scanner (System.in) ;
    int jam = input.nextInt() ;
    int menit = jam * 60;
    System.out.println(menit);
}
}
