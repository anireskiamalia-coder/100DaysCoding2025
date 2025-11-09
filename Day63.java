import java.util.Scanner;
public class day63 {
    public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      System.out.print("N: ");
      int N = input.nextInt();
      int jumlah = 1;  
        for(int i = 1; i <= N; i++){
            System.out.print(i + " ");
            jumlah *= i;
        }  
        
        System.out.println("\nHasil kali dari 1-"+N+" adalah "+jumlah);
    }
}
