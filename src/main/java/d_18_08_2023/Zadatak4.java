//Napisati program koji stampa 25 _ (donjih crta), pritom na svaku 5. iteraciju odstampa i novi red. Zadatak resiti pomocu FOR petlje.
//Primer izvrsenja:
//_ _ _ _ _
//_ _ _ _ _
//_ _ _ _ _
//_ _ _ _ _
//_ _ _ _ _

package d_18_08_2023;

public class Zadatak4 {
    public static void main(String[] args) {
        int a =25;//ukupno crta
        int c =5; //crta u iteraciji
        int i; //brojac
        for (i=0;i<(a/c);i=i+1){
            int b = 0; //brojac
            for (b=0;b<(a/c);b=b+1){
                System.out.print("_");
            }
            System.out.println();
        }
    }
}
