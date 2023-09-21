package p_18_09_2023.Zadatak2;

public abstract class Student {
    protected String nameAndSurname;
    protected String studentIndex;
    protected int yearOfStudy;

    public Student(String nameAndSurname, String studentIndex, int yearOfStudy) {
        this.nameAndSurname = nameAndSurname;
        this.studentIndex = studentIndex;
        this.yearOfStudy = yearOfStudy;
    }

    public abstract int scholarshipCost();
    public abstract boolean isStudentOnBudget();

    public void print(){
        System.out.println(this.nameAndSurname+", "+this.studentIndex+", "+this.yearOfStudy);
        System.out.println("Financing: " + (isStudentOnBudget()? "budget":"self financed"));
        System.out.println("scholarship cost " + this.scholarshipCost());
    }
}
