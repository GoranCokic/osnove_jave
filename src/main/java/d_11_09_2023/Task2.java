//2.Zadatak
//Kreirati klasu Korisnik koja ima
//ime
//prezime
//gettere i settere za ime i prezime
//konstuktore koje mislite da su vam potrebni
//metoda koja stampa u formatu:
//(ime) (prezime)
//
//Kreirati klasu FacebookPost
//opis
//korisnik (referenca na korisnika koji je kreirao post)
//konstrukore koje mislite da su vam potrebni
//metoda print, stampa u formatu:
//(ime) (prezime)
//(opis post-a)
//
//U main metodi, kreirati jedan facebook post i jednog korisnika i pozvati svaku od metoda

package d_11_09_2023;

public class Task2 {
    public static void main(String[] args) {
        User user = new User("Hugh","Mungus");
        FacebookPost facebookPost = new FacebookPost("some text", user);
        user.print();
        System.out.println("-----");
        facebookPost.print();
    }
}
