package p_19_09_2023.Zadatak2;

import java.util.ArrayList;

public class Discipline {
    protected String nameOfDiscipline;
    protected String typeOfDiscipline; //runner or jumper
    protected ArrayList<Athlete> athletes;

    public Discipline(String nameOfDiscipline, String typeOfDiscipline) {
        this.nameOfDiscipline = nameOfDiscipline;
        this.typeOfDiscipline = typeOfDiscipline;
        this.athletes = new ArrayList<Athlete>();
    }

    public void addAthleteToDiscipline(Athlete athlete) {
        this.athletes.add(athlete);

    }

    public void disqualifyAnAthelte(String nameOfAthlete) {
        for (int i = 0; i < athletes.size(); i++) {
            if (this.athletes.get(i).getNameAndSurname().equals(nameOfAthlete)) {
                this.athletes.remove(this.athletes.get(i));
            }
        }
    }

    private Athlete bestAthlete() {
        Athlete bestAthlete = this.athletes.get(0);
        if (this.athletes.isEmpty()) {
            return null;
        } else {
            for (int i = 0; i < this.athletes.size(); i++) {
                if (bestAthlete.isThisAthelteBetter(this.athletes.get(i))) {
                    bestAthlete = this.athletes.get(i);
                }
                ;
            }
        }
        return bestAthlete;
    }


    public void printInfoAboutWinner() {
        bestAthlete().print();
    }
}
