//Napisati program koji od korisnika ucitava N brojeva  i ispisuje koliko je parnih brojeva uneo korisnik. N nam kaze koliko broja ce korisnik da unese.
//Primer izvrsenja:
//Unesite N: 6
//Unesite broj: 2
//Unesite broj: 4
//Unesite broj: 9
//Unesite broj: 12
//Unesite broj: 8
//Unesite broj: 1
//		Uneto je 4 parna broja.

package p_21_08_2023;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i;
        int brojParnih=0;
        for(i=0;i<n;i=i+1) {
            int broj = s.nextInt();

            if (broj%2==0){
                brojParnih=brojParnih+1;
            }
        }
        System.out.println(brojParnih);

    }
}
