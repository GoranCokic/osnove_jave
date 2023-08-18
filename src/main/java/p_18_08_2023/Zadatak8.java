//Napisati program koji ispisuje SAMO PARNE brojeve od 1 do 100

package p_18_08_2023;

public class Zadatak8 {
    public static void main(String[] args) {
        int i;
        for (i=1;i<=100;i=i+1){
            if(i%2==0){
                System.out.println(i);
            }
        }

    }
}
