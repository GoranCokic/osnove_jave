package d_15_09_2023.Assigment1;

public class Coach extends Person {
    private int yearsOfExperience;
    private String coachType;

    public Coach() {
    }

    public Coach(String nameAndSurname, String jmbg, int birthYear, int yearsOfExperience, String coachType) {
        super(nameAndSurname, jmbg, birthYear);
        this.yearsOfExperience = yearsOfExperience;
        this.coachType = coachType;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getCoachType() {
        return coachType;
    }

    public void setCoachType(String coachType) {
        this.coachType = coachType;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(this.yearsOfExperience + ", " + this.coachType);
    }
}
