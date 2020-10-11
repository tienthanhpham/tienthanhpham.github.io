package vn.techmaster.rockpaperscissor;

public class Player implements Comparable<Player> {
    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Player o) {
        return score - o.score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return name;
    }
}
