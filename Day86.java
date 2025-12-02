
package pkg100daysofcoding;
public class Day86 {
    public static void main(String[] args) {
        int[] angka = {10, 20, 30, 40, 50};
        int min = angka[0];
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] < min) {
                min = angka[i];
            }
        }
        System.out.println("Angka tertinggi: "+min);
    }
}
