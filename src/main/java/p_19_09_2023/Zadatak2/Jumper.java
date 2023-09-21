package p_19_09_2023.Zadatak2;

public class Jumper extends Athlete {
    public Jumper(String nameAndSurname, int competitionResult) {
        super(nameAndSurname, competitionResult);
    }

    @Override
    public boolean isThisAthelteBetter(Athlete input) {
        if (this.competitionResult < input.competitionResult) {
            return true;
        } else {
            return false;
        }
    }

}
