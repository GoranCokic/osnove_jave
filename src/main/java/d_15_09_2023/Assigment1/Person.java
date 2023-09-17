package d_15_09_2023.Assigment1;

public class Person {
    protected String nameAndSurname;
    protected String jmbg;
    protected int birthYear;

    //constructors begin
    public Person() {
    }

    public Person(String nameAndSurname, String jmbg, int birthYear) {
        this.nameAndSurname = nameAndSurname;
        this.jmbg = jmbg;
        this.birthYear = birthYear;
    }
    //constructors end

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public void setNameAndSurname(String nameAndSurname) {
        this.nameAndSurname = nameAndSurname;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    //getters and setters

    public void print() {
        System.out.println(this.nameAndSurname + ", " + this.jmbg + ", " + this.birthYear);
    }
}
