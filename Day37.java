impor java.util.Scanner;
public class main{
  public static void main(String args[]) {
    Scanner input = new Scanner (System.in); 
    System.out.println("Masukkan angka: ");
    int angka = input. nextInt() ;
    if(angka %2 == 0) {
      System.out.println("Bilangan genap") ;
    }else{
      System.out.println("Bilangan ganjil") ;
    }
      
  }
}
