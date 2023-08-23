//Napisati program koji od brojeva od 1 do 10 formira string koji ima spoj svih brojeva.
//Primer izvrsenja:
//String je 12345678910

package p_21_08_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        int i;
        String rezultat="";
        for (i=1;i<=10;i=i+1){
            rezultat=rezultat+i;
        }
        System.out.println(rezultat);
    }
}
