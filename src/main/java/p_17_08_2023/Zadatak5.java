//Napisati program koji ucitava brojeve a, b i c sa tastature i proverava da li je broj a u opsegu od b do c.
//Primer izvrsenja:
//Unesite b: 5
//Uneiste c: 50
//Unesite a: 15
//A je u opsegu izmedju 5 i 50

package p_17_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if(a>b&&a<c){
            System.out.println( a + " je u opsegu izmedju " + b + " " + c);
        } else{
            System.out.println( a + " nije u opsegu izmedju " + b + " " + c);
    }
    }
}
