package p_18_09_2023.Zadatak2;

public class StudentMaster extends Student{

    public StudentMaster(String nameAndSurname, String studentIndex, int yearOfStudy) {
        super(nameAndSurname, studentIndex, yearOfStudy);
    }

    public int scholarshipCost() {
        return 100000;
    }

    public boolean isStudentOnBudget() {
        return (this.yearOfStudy <2 ? true:false);
    }
}
