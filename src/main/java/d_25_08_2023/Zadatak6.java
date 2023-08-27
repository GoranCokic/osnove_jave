//Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//
//Primer izvrsenja:
//izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1

package d_25_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();

        int rezultat = kolikoImaCelihBrojevaIzmedjuDveVrednosti(m, n);
        System.out.println(rezultat);
    }

    public static Integer kolikoImaCelihBrojevaIzmedjuDveVrednosti(int min, int max) {
        return max - min - 1;
    }
}
