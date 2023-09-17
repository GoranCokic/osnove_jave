package d_14_09_2023.Assignment1;

import java.util.ArrayList;

public class Student {
    private String studentNumber;
    private String nameAndSurname;
    private String typeOfStudy; //undergrad, master, phd
    private ArrayList<Exam> studentExamsArray;

    public Student(String studentNumber, String nameAndSurname, String typeOfStudy) {
        this.studentNumber = studentNumber;
        this.nameAndSurname = nameAndSurname;
        this.typeOfStudy = typeOfStudy;
        this.studentExamsArray = new ArrayList<Exam>();
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public void setNameAndSurname(String nameAndSurname) {
        this.nameAndSurname = nameAndSurname;
    }

    public String getTypeOfStudy() {
        return typeOfStudy;
    }

    public void setTypeOfStudy(String typeOfStudy) {
        this.typeOfStudy = typeOfStudy;
    }

    public ArrayList<Exam> getStudentExamsArray() {
        return studentExamsArray;
    }

    public void addExamToExamsArray(Exam exam) {
        this.studentExamsArray.add(exam);
    }
    public void print(){
        System.out.println(this.studentNumber + " - " + this.nameAndSurname + " - " + this.typeOfStudy);
        System.out.println("School subjects");
        int markSum = 0;
        int counter = 0;
        for (int i = 0; i < this.studentExamsArray.size(); i++) {
            this.studentExamsArray.get(i).print();
            if (this.studentExamsArray.get(i).isPassed()){
                markSum = markSum + this.studentExamsArray.get(i).getMarkNumber();
                counter++;
            }
        }
        System.out.println("Average mark: " + 1.0 * markSum/counter);
    }
}
