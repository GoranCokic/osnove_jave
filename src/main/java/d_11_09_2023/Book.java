package d_11_09_2023;

public class Book {
    private String ISBN;
    private String bookName;
    private int releaseYear;
    private Author author;

    Book(String ISBN, String bookName, int releaseYear, Author author) {
        this.ISBN = ISBN;
        this.bookName = bookName;
        this.releaseYear = releaseYear;
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    public void print(){
        System.out.println("ISBN is: " + this.ISBN);
        System.out.println("Book name is: " + this.bookName +" and release year is " + this.releaseYear);
        System.out.println("Author is: " + this.author.getNameAndSurname());
    }
}

