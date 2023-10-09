package ticTacToe;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;



public class TicTacToePersistence {
	
    public TicTacToe load(String filePath) throws IOException, InvalidMoveException {
    	
        TicTacToe game = new TicTacToe();
        
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        
        String line;
        int lineNumber = 1;

        while ((line = reader.readLine()) != null) {
            if (!line.matches("[XO][0-2][0-2]")) {
                reader.close();
                throw new InvalidMoveException("Invalid format", lineNumber);
            }

        }
        reader.close();
        return game;
    }
    
    public class InvalidMoveException extends Exception {
        private static final long serialVersionUID = 1L;
    	private int lineNumber;

        public InvalidMoveException(String message, int lineNumber) {
            super(message);
            this.lineNumber = lineNumber;
        }

        public int getLineNumber() {
            return lineNumber;
        }
    }

}
