package vn.techmaster.rockpaperscissor;

public class GamePlayer extends Player {
    private int choice;

    public GamePlayer(String name) {
        super(name);
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public void increaseScore() {
        setScore(getScore() + 1);
    }
}
