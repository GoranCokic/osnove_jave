//Napisati program koji od brojeva od 1 do 10 formira string tako da se na pocetnu vrednost stringa … (tri tacke) sa leve strane dodaju neparni brojevi a sa desne parni.
//Primer izvrsenja:
//97531…246810

package p_21_08_2023;

public class Zadatak3 {
    public static void main(String[] args) {
        int i;
        String rezultat="";
        for (i=1;i<=10;i=i+1) {
            if (i%2==0){
                rezultat=rezultat+i;
            }else {
                rezultat = i + rezultat;
            }
        }
        System.out.println(rezultat);
    }
}
