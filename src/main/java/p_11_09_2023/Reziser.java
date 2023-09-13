package p_11_09_2023;

public class Reziser {
    private String nameAndSurname;
    private int age;

    public Reziser(String nameAndSurname, int age) {
        this.nameAndSurname = nameAndSurname;
        this.age = age;
    }

    public String getNameAndSurname() {
        return this.nameAndSurname;
    }

    public void setNameAndSurname(String nameAndSurname) {
        this.nameAndSurname = nameAndSurname;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void print() {
        System.out.println("name and surname are: : " + this.nameAndSurname);
        System.out.println("age of rezisera is: " + this.age);
    }
}
