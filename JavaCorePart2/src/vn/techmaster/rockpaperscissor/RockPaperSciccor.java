package vn.techmaster.rockpaperscissor;

import java.util.Collections;
import java.util.Scanner;

public class RockPaperSciccor extends Game {
    Scanner scanner = new Scanner(System.in);

    public RockPaperSciccor() {
        super();
    }

    private void initGame() {
        players.clear();
        players.add(new GamePlayer("Computer"));
        players.add(new GamePlayer("User"));
    }

    public void startGame() {
        initGame();
        System.out.println("Bat dau tro choi Rock Paper Scissors: ");

        for (int i = 0; i < 3; i ++)
            playGame();

        endGame();
    }

    public void playGame() {
        GamePlayer computer = (GamePlayer) players.get(0);
        GamePlayer player = (GamePlayer) players.get(1);
        computer.setChoice((int)(Math.random() * 3));
        while (true) {
            System.out.print("Nhap vao lua chon Rock (0), Paper (1), Scissors (2): ");
            var choice = scanner.nextByte();

            if (choice == 0) {
                player.setChoice(0);
                break;
            } else if (choice == 1) {
                player.setChoice(1);
                break;
            } else if (choice == 2) {
                player.setChoice(2);
                break;
            }
        }

        GamePlayer winner = GameLogic.checkWinner(computer, player);
        if (winner == null)
            System.out.println("Hai ben hoa nhau");
        else
            System.out.println("Nguoi thang la: " + winner);
    }

    public void endGame() {
        Collections.sort(players);
        GamePlayer p1 = (GamePlayer) players.get(0);
        GamePlayer p2 = (GamePlayer) players.get(1);
        System.out.println("------------------------");
        System.out.println(p1 + " vs. " + p2);
        System.out.println("Score cua " + p1 + ": " + p1.getScore());
        System.out.println("Score cua " + p2 + ": " + p2.getScore());

        if (p1.getScore() == p2.getScore())
            System.out.println("Hai ben hoa nhau");
        else if (p1.getScore() > p2.getScore())
            System.out.println(p1 + " thang");
        else
            System.out.println(p2 + " thang");

    }
}
