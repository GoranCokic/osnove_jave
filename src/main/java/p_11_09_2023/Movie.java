package p_11_09_2023;

public class Movie {
    private String film;
    private int year;
    private Reziser directedBy;

    public Movie(String film, int year, Reziser directedBy) {
        this.film = film;
        this.year = year;
        this.directedBy= directedBy;
    }

    public String getFilm() {
        return this.film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public int getYear() {
        return this.year;
    }

    public void setGodina(int godina) {
        this.year = godina;
    }

    public Reziser getDirectedBy(Reziser directedBy){
        return directedBy;
    }
    public void setDirectedBy(Reziser directedBy){
        this.directedBy = directedBy;
    }

    public void print() {
        System.out.println("Movie is: " + this.film);
        System.out.println("Year is: " + this.year);
        System.out.println("Director was: " + this.directedBy.getNameAndSurname());
    }

}
