package d_15_09_2023.Assignment2;

import java.util.ArrayList;

public class Player extends Person {
    private int playerNumber;
    private String playerPosition;
    private ArrayList<Card> cardList;
    private boolean isPlayerCaptain;

    //constructors begin

    public Player() {
        super();
    }

    public Player(String nameAndSurname, String jmbg, int birthYear, int playerNumber, String playerPosition, boolean isPlayerCaptain) {
        super(nameAndSurname, jmbg, birthYear);
        this.playerNumber = playerNumber;
        this.playerPosition = playerPosition;
        this.cardList = new ArrayList<Card>();
        this.isPlayerCaptain = isPlayerCaptain;
    }

    //constructors end

    //getters and setters begin
    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public String getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(String playerPosition) {
        this.playerPosition = playerPosition;
    }

    public boolean isPlayerCaptain() {
        return isPlayerCaptain;
    }

    public void setPlayerCaptain(boolean playerCaptain) {
        isPlayerCaptain = playerCaptain;
    }
    //getters and setters end

    public void addCardToPlayer(Card card){
        this.cardList.add(card);
    }

    public int numberOfYellowCards(){
        int counter = 0;
        for (int i = 0; i < this.cardList.size(); i++) {
            if (this.cardList.get(i).getCardType().equals("yellow")){
                counter++;
            }
        }
        return counter;
    }

    public int numberOfRedCards(){
        int counter = 0;
        for (int i = 0; i < this.cardList.size(); i++) {
            if (this.cardList.get(i).getCardType().equals("red")){
                counter++;
            }
        }
        return counter;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(this.playerNumber + ", " + this.playerPosition + (this.isPlayerCaptain ? ", is captain" : ""));
        System.out.println("Number of yellow cards " + this.numberOfYellowCards());
        System.out.println("Number of red cards " + this.numberOfRedCards());
    }
}
