package vn.techmaster.rockpaperscissor;

public class GameLogic {

    public static GamePlayer checkWinner(
            GamePlayer player1,
            GamePlayer player2) {
        GamePlayer winner;

        if (player1.getChoice() == player2.getChoice())
            return null;
        else {
            if (player1.getChoice() < player2.getChoice()) {
                if (player2.getChoice() - player1.getChoice() == 1)
                    winner = player2;
                else
                    winner = player1;
            } else {
                if (player1.getChoice() - player2.getChoice() == 1)
                    winner = player1;
                else
                    winner = player2;
            }
        }
        winner.increaseScore();
        return winner;
    }
}
