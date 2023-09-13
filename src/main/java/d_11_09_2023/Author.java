package d_11_09_2023;

public class Author {
    private String nameAndSurname;

    Author(String nameAndSurname){
        this.nameAndSurname = nameAndSurname;
    }
    public String getNameAndSurname(){
        return nameAndSurname;
    }
    public void setNameAndSurname(String nameAndSurname){
        this.nameAndSurname = nameAndSurname;
    }
    public void print(){
        System.out.println(nameAndSurname);
    }

}
