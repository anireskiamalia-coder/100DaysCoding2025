package pkg100daysofcoding;
import java.util.Scanner;
public class Day84 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();   

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'a' || c == 'A' ||
                c == 'i' || c == 'I' ||
                c == 'u' || c == 'U' ||
                c == 'e' || c == 'E' ||
                c == 'o' || c == 'O') {

                count++;
            }
        }

        System.out.println(count);
        
    }
}

