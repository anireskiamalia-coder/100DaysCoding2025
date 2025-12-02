
package pkg100daysofcoding;
public class Day86 {
    public static void main(String[] args) {
        int[] angka = {50,40,30,20,10};
        int min = angka[0];
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] < min) {
                min = angka[i];
            }
        }
        System.out.println("Angka terkecil: "+min);
    }
}
