package p_18_09_2023.Zadatak2;

public class StudentOsnovnih extends Student {

    public StudentOsnovnih(String nameAndSurname, String studentIndex, int yearOfStudy) {
        super(nameAndSurname, studentIndex, yearOfStudy);
    }

    public int scholarshipCost() {
        return 90000;
    }

    public boolean isStudentOnBudget() {
        return (this.yearOfStudy <5 ? true:false);
    }
}
