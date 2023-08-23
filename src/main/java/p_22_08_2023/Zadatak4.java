//(za vezbanje) Napisati pogram koji vrsi korkeciju zvuka. Korisnik unosi akcije “pojacaj” ili “smanji” ili “play”. Program radi dok korisnik ne unese play. Inicijalna jacina zvuka je 75.
//Pojacaj - akcije koja povecava jacinu zvuka za 10
//smanji - akcija koja smajnjuje jacinu zvuka za 10.
//Zvuk nakon nijedne akcije ne sme da spadne ispod nule ili da ode preko 100.
//Na kraju programa odstampati jacinu zvuka.
//
//Primer izvrsenja:
//Unesite akciju: pojacaj (iz 75 u 85)
//Unesite akciju: pojacaj ( iz 85 u 95)
//Unesite akciju: pojacaj (iz 95 u 100)
//Unesite akciju: smanji (iz 100 u 90)
//Unesite akciju: smanji (iz 90 u 80)
//Unesite akciju: play
//Jacina zvuka je 80.

package p_22_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String komanda = "";
        int jacinaZvuka = 75;
        boolean uslov = true;
        while (uslov) {
            komanda = s.next();
            if (komanda.equals("pojacaj")) {
                if (jacinaZvuka <= 90) {
                    jacinaZvuka = jacinaZvuka + 10;
                    System.out.println("jacina zvuka je: " + jacinaZvuka);
                } else if(jacinaZvuka>90&&jacinaZvuka<=100){
                    jacinaZvuka=100;
                    System.out.println("jacina zvuka je: " + jacinaZvuka);
                }
            } else if (komanda.equals("smanji")) {
                if (jacinaZvuka >= 10) {
                    jacinaZvuka = jacinaZvuka - 10;
                    System.out.println("jacina zvuka je: " + jacinaZvuka);
                } else if(jacinaZvuka < 10){
                    jacinaZvuka=0;
                    System.out.println("jacina zvuka je: " + jacinaZvuka);
                }
            } else if (komanda.equals("play")) {
                uslov = false;
                System.out.println("jacina zvuka je: " + jacinaZvuka);
            }
        }
    }
}
