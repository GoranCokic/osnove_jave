package d_11_09_2023;

public class User {
    private String name;
    private String surname;

    User(String name,String surname){
        this.name=name;
        this.surname=surname;
    }
    public String getName(){
        return this.name;
    }
    public void setName(){
        this.name=name;
    }
    public String getSurname(){
        return this.surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void print(){
        System.out.println("Name is " + this.name + " and surname is " + this.surname);
    }
}
