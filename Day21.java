public class main {
public static void main(String[] args) {
        int a =23;
        int b = 43;
        
        System.out.println("Sebelum ditukar ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("Setelah ditukar ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
