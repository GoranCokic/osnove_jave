package d_15_09_2023.Assigment1;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("player1","23123",1990,3,"position1",false);
        Player player2 = new Player("player2","64546",2000,8,"position3",true);

        Coach coach1 = new Coach("coach1","343434",1980,20,"type1");
        Coach coach2 = new Coach("coach2","65656",1970,25,"type2");

        player1.print();
        System.out.println();
        player2.print();
        System.out.println();

        coach1.print();
        System.out.println();
        coach2.print();
        System.out.println();
    }
}
