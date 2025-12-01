package pkg100daysofcoding;
public class Day85 {
    public static void main(String[] args) {
         int[] angka = {10, 20, 30, 40, 50};
        int max = angka[0];
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] > max) {
                max = angka[i];
            }
        }
        System.out.println("Angka tertinggi: "+max);
    }
}
