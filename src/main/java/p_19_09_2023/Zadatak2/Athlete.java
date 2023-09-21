package p_19_09_2023.Zadatak2;

public abstract class Athlete {
    private String nameAndSurname;
    protected int competitionResult;

    public Athlete(String nameAndSurname, int competitionResult) {
        this.nameAndSurname = nameAndSurname;
        this.competitionResult = competitionResult;
    }

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public void setNameAndSurname(String nameAndSurname) {
        this.nameAndSurname = nameAndSurname;
    }

    public int getCompetitionResult() {
        return competitionResult;
    }

    public void setCompetitionResult(int competitionResult) {
        this.competitionResult = competitionResult;
    }

    public abstract boolean isThisAthelteBetter(Athlete input);

    public void print() {
        System.out.println(this.nameAndSurname + ", " + this.competitionResult);
    }
}
