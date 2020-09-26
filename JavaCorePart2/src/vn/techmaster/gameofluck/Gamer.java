package vn.techmaster.gameofluck;

public class Gamer implements Playable {
    private String name;

    public Gamer(String name) {
        this.name = name;
    }

    @Override
    public int rockPaperScissor() {
        return (int)(Math.random() * 3);
    }

    @Override
    public String decide(Playable gamer2) {
        if ((this.rockPaperScissor() == 0)
                && (gamer2.rockPaperScissor() == 2)) {
            return this.toString();
        }
        if ((this.rockPaperScissor() == 2)
                && (gamer2.rockPaperScissor() == 0))
            return gamer2.toString();

        return (this.rockPaperScissor()
                > gamer2.rockPaperScissor()) ?
                this.toString() : gamer2.toString();
    }

    @Override
    public String toString() {
        return name;
    }
}
