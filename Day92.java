
package pkg100daysofcoding;

import java.util.Scanner;

public class Day92 {
    public static int LuasPersegi(int sisi) {
        return sisi * sisi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi persegi: ");
        int s = input.nextInt();

        int luas = LuasPersegi(s);
        System.out.println(luas);

        input.close();
    }
}
