//Napisati program koji stampa sve brojeve od 1 do 100 tako da:
//sve parne stampa kao negativne
//sve neprane kao pozitivne brojeve
//                Primer izvrssenja:
//	   0, 1, -2, 3, -4, 5, -6, ……..

package d_18_08_2023;

public class Zadatak5 {
    public static void main(String[] args) {
        int i;
        for (i = 0; i <= 100; i = i + 1) {
            if (i % 2 == 0) {
                System.out.print(i * -1);
            } else {
                System.out.print("," + i);
            }
        }
    }
}
