//Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.Iz main-a pozvati izvrsenje metode za razlicite vrednosti.

package d_25_08_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        int x = 5;
        int rezultat = stampajVrednostZa10Vecu (x);
        System.out.println(rezultat);
    }
    public static Integer stampajVrednostZa10Vecu (int broj){
        return  broj*10;
    }
}
