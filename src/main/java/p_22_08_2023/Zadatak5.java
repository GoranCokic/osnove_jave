//Napišite program koji simulira ponašanje jednog test slučaja. Test slučaj ima 5 provera, a program će svaku proveru validirati jednu po jednu sve dok ne proveri sve ili dok neka provera ne prodje. Korisnik sa tastature unosi očekivane i stvarne rezultate za svaku proveru. Ako dođe do neuspeha, program će ispisati odgovarajuću poruku.
//	Primer izvrsenja 1:
//	Unesite expected: hello
//	Unesite actual: hello
//Unesite expected: hello1
//	Unesite actual: hello1
//Unesite expected: hello2
//	Unesite actual: hello
//	Test failed: Expected hello2 but got hello.
//
//Primer izvrsenja 2:
//	Unesite expected: hello
//	Unesite actual: hello
//Unesite expected: hello1
//	Unesite actual: hello1
//Unesite expected: hello2
//	Unesite actual: hello2
//Unesite expected: hello3
//	Unesite actual: hello3
//Unesite expected: hello4
//	Unesite actual: hello4
//	Test passed.

package p_22_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i=0;
        String errorMessage="";
        boolean hasError=false;
        while(!hasError && i < 5){
            String expected=s.next();
            String actual=s.next();
            if(!actual.equals(expected)){
                errorMessage=errorMessage + "Test failed: Expected " + expected +" but got " + actual;
                hasError=true;
            }
        i++;
        }
        if(hasError==true){
            System.out.println("test failed: " + errorMessage);
        }else {
            System.out.println("Test passed.");
        }
    }
}
