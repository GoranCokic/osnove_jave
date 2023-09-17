package d_15_09_2023.Assigment1;

public class Player extends Person {
    private int playerNumber;
    private String playerPosition;
    private boolean isPlayerCaptain;

    //constructors begin

    public Player() {
        super();
    }

    public Player(String nameAndSurname, String jmbg, int birthYear, int playerNumber, String playerPosition, boolean isPlayerCaptain) {
        super(nameAndSurname, jmbg, birthYear);
        this.playerNumber = playerNumber;
        this.playerPosition = playerPosition;
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

    @Override
    public void print() {
        super.print();
        System.out.println(this.playerNumber + ", " + this.playerPosition + (this.isPlayerCaptain ? ", is captain" : ""));
    }
}
