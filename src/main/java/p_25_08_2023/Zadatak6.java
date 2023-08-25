//6. Napisati metodu koja vraca suprotno negativni broj od prosledjenog. Metoda prima broj N i vraca ga sa negativnom vrednoscu.
//Primer: Ako se metoda pozove za N=10, vraca -10
//	Ako se metoda pozove za N=-11, vraca 11

package p_25_08_2023;

public class Zadatak6 {
    public static void main(String[] args) {
        int n= 5;
        int rezultat = pravljenjeNegativno(n);
        System.out.println(rezultat);
    }
    public static int pravljenjeNegativno(int broj){
        return broj*(-1);
    }
}
