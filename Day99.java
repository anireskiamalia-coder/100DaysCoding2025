package pkg100daysofcoding;

import java.util.Scanner;

public class Day99 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        System.out.println("Bilangan prima dari 1-"+N+": ");
        for (int i = 1; i < N; i++) {
            if (i == 1) continue;
            boolean prima = true;
            for (int j = 2; j*j <= i; j++) {
                if (i % j == 0) {
                    prima = false;
                break;    
                }
            }
                if (prima) {
                    System.out.print(i+" ");
            }
            
        }
    }
    
}
