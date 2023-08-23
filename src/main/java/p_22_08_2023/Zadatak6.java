//Zadatak
//Napisati program koji radi bipovanje ruznih reci. Program radi za jednu recenicu, sto znaci da ucitava od korisnika rec po rec sve dok se ne unese rec sa tackom. Za reci koje su nepristojne ispisuje beeeeeeeeeeeeep.
//Ruzne reci koje program prepoznaje su:
//zajebava
//mars
//stoko
//svinjo
//Unesite rec: Jel
//Jel
//Unesite rec:ti
//ti
//Unesite rec:to
//to
//Unesite rec:mene
//mene
//Unesite rec:zajebavas
//beeeeeeeeeep
//Unesite rec:stoko
//beeeeeeeeeep
//Unesite rec:jedna.
//jedna.
//Kraj programa.

package p_22_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        boolean uslov =true;
        String loseReci="zajebava mars stoko svinjo";
        while(true){
            String rec=s.next();
            if (loseReci.contains(rec)){
                System.out.println("beeeeeeeeeep");
            }else if(rec=="jedna."){
                System.out.println(rec);
                uslov=false;
            }
            else{
                System.out.println(rec);
            }
        }
    }
}
