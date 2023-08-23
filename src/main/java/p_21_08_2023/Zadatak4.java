//Napisati program koji pronalazi 7 stepen broja 2. Koristeci FOR petlju
//Izvrsenje:
//            2 na stepen 7 je 128
//
//Podsetnik: 2 na 7 moze da se predstavi kao  2 * 2 * 2 * 2 * 2 * 2 * 2

package p_21_08_2023;

public class Zadatak4 {
    public static void main(String[] args) {
        int i;
        int rezultat=1;
        for (i=0;i<7;i=i+1){
            rezultat=rezultat*2;
        }
        System.out.println(rezultat);
    }
}
