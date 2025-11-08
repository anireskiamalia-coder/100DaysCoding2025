import java.util.Scanner;
public class day62 {
    public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      System.out.print("N: ");
      int N = input.nextInt();
      int jumlah = 0;  
        for(int i = 1; i <= N; i++){
            System.out.print(i + " ");
            jumlah += i;
        }  
        
        System.out.println("\nTotal jumlah dari 1-"+N+" adalah "+jumlah);
    }
}
