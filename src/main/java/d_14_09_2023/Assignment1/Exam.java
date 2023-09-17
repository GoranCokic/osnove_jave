package d_14_09_2023.Assignment1;

public class Exam {
    private String schoolSubject;
    private int markNumber; // from 5 to 10;
    private String professorName;

    public Exam(String schoolSubject, int markNumber, String professorName) {
        this.schoolSubject = schoolSubject;
        this.markNumber = markNumber;
        this.professorName = professorName;
    }

    public String getSchoolSubject() {
        return schoolSubject;
    }

    public void setSchoolSubject(String schoolSubject) {
        this.schoolSubject = schoolSubject;
    }

    public int getMarkNumber() {
        return markNumber;
    }

    public void setMarkNumber(int markNumber) {
        this.markNumber = markNumber;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public boolean isPassed(){
        return (this.markNumber>=6) ? true : false;
    }
    public void print(){
        System.out.println(this.schoolSubject + " - " + this.professorName + " - " + this.markNumber + (isPassed() ? "":" - didn't pass"));
    }
}
