package p_11_09_2023;

public class Zadatak3 {
    public static void main(String[] args) {
        Reziser reziser = new Reziser("famous guy", 55);
        Movie movie = new Movie("armagedon", 1990, reziser);

        movie.print();
        reziser.print();
    }
}
