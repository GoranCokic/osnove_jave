//Napisati program koji sumira parne brojeve od 1 do 50 i na kraju programa ispisuje sumu

package p_21_08_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        int i;
        int suma=0;
        for (i=0;i<50;i=i+1){
            if(i%2==0){
                suma=suma+i;
            }
        }
        System.out.println(suma);
    }
}
