package ticTacToe;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InvalidMoveException {
        String[] gameFiles = {
            "xwin.txt","owin.txt", "draw.txt", "valid.txt", "invalid.txt"
        };

        TicTacToePersistence persistence = new TicTacToePersistence();

        for (String file : gameFiles) {
            try {
                TicTacToe game = persistence.load(file);
                printBoard(game);
                System.out.println("Result: " + game.decide());
            } catch (IOException e) {
            	e.printStackTrace();
                System.out.println("Error reading file: ");
            } catch (ticTacToe.TicTacToePersistence.InvalidMoveException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            System.out.println();
        }
    }

    private static void printBoard(TicTacToe game) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(game.getPlayer(i, j) + "|");
            }
            System.out.println();
        }
    }
}