//Kreirati klasu Autor koja ima
//-ime i prezime
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu:
//(ime autora) (prezime autora)
//
//Kreirati klasu Knjiga koji ima:
//-ISBN
//-naziv
//-godina izdanja
//-autor
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//(ISBN)
//(naziv) - (godina izdanja)
//autor: (ime autora) (prezime autora)
//
//	U glavnom programu napraviti vise autora sa vise knjiga.

package d_11_09_2023;

public class Task1 {
    public static void main(String[] args) {
        Author author1 = new Author("famous guy1");
        Author author2 = new Author("famous guy2");
        Author author3 = new Author("famous guy3");

        Book book1 = new Book("123","'interesting book1'", 1990,author1);
        Book book2 = new Book("456","'interesting book2'", 1991,author1);
        Book book3 = new Book("789","'interesting book3'", 1992,author1);

        Book book4 = new Book("abc","'bad book1'", 2000,author2);

        Book book5 = new Book("jkl", "'ok book1'", 1600, author3);

        book1.print();
        System.out.println("----");
        book2.print();
        System.out.println("----");
        book3.print();
        System.out.println("----");
        book4.print();
        System.out.println("----");
        book5.print();
        System.out.println("----");
    }
}
