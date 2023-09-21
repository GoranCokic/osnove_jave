package p_19_09_2023.Zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {
        Runner runner1 = new Runner("runner1",5);
        Runner runner2 = new Runner("runner2",1);
        Runner runner3 = new Runner("runner3",6);
        Runner runner4 = new Runner("runner4",8);
        Runner runner5 = new Runner("runner5",10);

        Jumper jumper1 = new Jumper("jumper1",5);
        Jumper jumper2 = new Jumper("jumper2",1);
        Jumper jumper3 = new Jumper("jumper3",6);
        Jumper jumper4 = new Jumper("jumper4",8);
        Jumper jumper5 = new Jumper("jumper5",10);

        System.out.println("------");
        runner1.print();
        System.out.println("------");

        Discipline running = new Discipline("running","running");
        Discipline jumping = new Discipline("jumping","jumping");


        running.addAthleteToDiscipline(runner1);
        running.addAthleteToDiscipline(runner2);
        running.addAthleteToDiscipline(runner3);
        running.addAthleteToDiscipline(runner4);
        running.addAthleteToDiscipline(runner5);

        jumping.addAthleteToDiscipline(jumper1);
        jumping.addAthleteToDiscipline(jumper2);
        jumping.addAthleteToDiscipline(jumper3);
        jumping.addAthleteToDiscipline(jumper4);
        jumping.addAthleteToDiscipline(jumper5);

        System.out.println("Running winner is ");
        running.printInfoAboutWinner();
        System.out.println("------");
        System.out.println("Jumping winner is ");
        jumping.printInfoAboutWinner();

        System.out.println("------");
        jumping.disqualifyAnAthelte("jumper5");
        System.out.println("Jumping winner is ");
        jumping.printInfoAboutWinner();
    }
}
