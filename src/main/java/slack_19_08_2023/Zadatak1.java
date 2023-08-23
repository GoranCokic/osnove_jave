
//@here Neko je trazio jos neki zad za vezbanje, pa kad sam vec smislio da imate svi :partying_face:
//Napisati program koji iscrtava iks oks tablu. Stanje na tabli se cuva u intigeru koji uvek ima 9 cifara. Broj 1 u stanju je X, broj 2 je O, a 3 je prazni polje
//Primer izvrsenja:
//Unesite stanje table: 321311323
//  | O | X
//O | X | X
//  | O |
//Zadatak se resava for petljom

package slack_19_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String igrac1Znak = "X";
        String igrac2Znak = "O";

        String[] tabela = {
                "_", "|", "_", "|", "_", "_", "|", "_", "|", "_", "_", "|", "_", "|", "_"
        };
//        cuvaj samo polja
//        O |


        //Usputne promenljive
        String krajIgre = ""; // neka bude boolean
        String igrac ="";
        int redIgraca = 1; // readString "X" ili "O"
        String aktivanZnak = "";
        int a; //brojac za crtanje tabele
        int pozicija;
        int[] validnePozicije = {0, 2, 4, 5, 7, 9, 10, 12, 14};
        //Kraj Usputne promenljive
//        i, j,k,. ...

        //trenutno stanje tabele
        for (a = 0; a < 15; a = a + 5) {
            System.out.println(tabela[0 + a] + tabela[1 + a] + tabela[2 + a] + tabela[3 + a] + tabela[4 + a]);
        }
        //kraj trenutno stanje tabele

        //Pocetak igre
        while (!krajIgre.equals("krajIgre")) {
            System.out.println("------------------");
            System.out.println("pocetak ciklusa");
            System.out.println("------------------");
            System.out.println("polja idu od 1 do 9 - gore levo dole desno");

            //Naizmenicna smena igraca
            if (redIgraca == 1) {
                igrac = "Prvi";
                aktivanZnak = igrac1Znak;
//                System.out.print("Na redu je igrac " + igrac + " unesi poziciju sa znakom " + aktivanZnak + " : ");
                redIgraca = 2;
            } else {
                igrac = "Drugi";
                aktivanZnak = igrac2Znak;
//                System.out.print("Na redu je igrac " + igrac + " unesi poziciju sa znakom " + aktivanZnak + " : ");
                redIgraca = 1;
            }

            System.out.print("Na redu je igrac " + igrac + " unesi poziciju sa znakom " + aktivanZnak + " : ");
            //Kraj Naizmenicna smena igraca

            //provera validnosti pozicije i unos u tabelu. odnosno da se ne unese na vec zauzeto polje
            while (true) {
                pozicija = s.nextInt();
                System.out.println();
                System.out.println("aktivan znak je " + aktivanZnak);
                if (tabela[validnePozicije[pozicija - 1]].equals("_")&&!tabela[validnePozicije[pozicija - 1]].equals("X")&&!tabela[validnePozicije[pozicija - 1]].equals("O")) {
                    tabela[validnePozicije[pozicija - 1]] = aktivanZnak;

                    //trenutno stanje tabele
                    for (a = 0; a < 15; a = a + 5) {
                        System.out.println(tabela[0 + a] + tabela[1 + a] + tabela[2 + a] + tabela[3 + a] + tabela[4 + a]);
                    }
                    //kraj trenutno stanje tabele
                    break;
                } else {
                    System.out.println("pozicija nije validna");
                    System.out.println("trenutna tabela je:");

                    //trenutno stanje tabele
                    for (a = 0; a < 15; a = a + 5) {
                        System.out.println(tabela[0 + a] + tabela[1 + a] + tabela[2 + a] + tabela[3 + a] + tabela[4 + a]);
                    }
                    //kraj trenutno stanje tabele

                    System.out.print("unesite validnu poziciju: ");
                }
            }

            //provera uslova pobede
            if (
                    //gornji red
                    (
                    !tabela[validnePozicije[0]].equals("_") &&
                    tabela[validnePozicije[0]].equals(tabela[validnePozicije[1]]) &&
                    tabela[validnePozicije[0]].equals(tabela[validnePozicije[2]]) &&
                    tabela[validnePozicije[1]].equals(tabela[validnePozicije[2]])
                    )
                    ||
                    //srednji red
                    (
                    !tabela[validnePozicije[3]].equals("_") &&
                    tabela[validnePozicije[3]].equals(tabela[validnePozicije[4]]) &&
                    tabela[validnePozicije[3]].equals(tabela[validnePozicije[5]]) &&
                    tabela[validnePozicije[4]].equals(tabela[validnePozicije[5]])
                    )
                    ||
                    //donji red
                    (
                    !tabela[validnePozicije[6]].equals("_") &&
                    tabela[validnePozicije[6]].equals(tabela[validnePozicije[7]]) &&
                    tabela[validnePozicije[6]].equals(tabela[validnePozicije[8]]) &&
                    tabela[validnePozicije[7]].equals(tabela[validnePozicije[8]])
                    )
                    ||
                    //dijagonala gore levo dole desno
                    (
                    !tabela[validnePozicije[0]].equals("_") &&
                    tabela[validnePozicije[0]].equals(tabela[validnePozicije[4]]) &&
                    tabela[validnePozicije[0]].equals(tabela[validnePozicije[8]]) &&
                    tabela[validnePozicije[4]].equals(tabela[validnePozicije[8]])
                    )
                    ||
                    // dijagonala gore desno dole levo
                    (
                    !tabela[validnePozicije[2]].equals("_") &&
                    tabela[validnePozicije[2]].equals(tabela[validnePozicije[4]]) &&
                    tabela[validnePozicije[2]].equals(tabela[validnePozicije[6]]) &&
                    tabela[validnePozicije[4]].equals(tabela[validnePozicije[6]])
                    )
                    ||
                    //leva vertikala
                    (
                    !tabela[validnePozicije[0]].equals("_") &&
                    tabela[validnePozicije[0]].equals(tabela[validnePozicije[3]]) &&
                    tabela[validnePozicije[0]].equals(tabela[validnePozicije[6]]) &&
                    tabela[validnePozicije[3]].equals(tabela[validnePozicije[6]])
                    )
                    ||
                    //srednja vertikala
                    (
                    !tabela[validnePozicije[1]].equals("_") &&
                    tabela[validnePozicije[1]].equals(tabela[validnePozicije[4]]) &&
                    tabela[validnePozicije[1]].equals(tabela[validnePozicije[7]]) &&
                    tabela[validnePozicije[4]].equals(tabela[validnePozicije[7]])
                    )
                    ||
                    //desna vertikala
                    (
                    !tabela[validnePozicije[2]].equals("_") &&
                    tabela[validnePozicije[2]].equals(tabela[validnePozicije[5]]) &&
                    tabela[validnePozicije[2]].equals(tabela[validnePozicije[8]]) &&
                    tabela[validnePozicije[5]].equals(tabela[validnePozicije[8]])
                    )
            )
            //kraj provera uslova pobede

            {
                System.out.println("Pobedio je igrac: " + igrac);
                krajIgre="krajIgre";
            }
        }
        //kraj igre (odnosno while petlje)
    }
}