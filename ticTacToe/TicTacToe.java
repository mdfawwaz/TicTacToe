package ticTacToe;

public class TicTacToe {
    private char[][] board;

    public TicTacToe() {
        board = new char[3][3];
        initBoard();
    }

    private void initBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void playerMove(char player, int row, int col) {
        board[row][col] = player;
    }

    public char getPlayer(int row, int col) {
        return board[row][col];
    }

    public String decide() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
                return String.valueOf(board[i][0]);
            }
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != '-') {
                return String.valueOf(board[0][i]);
            }
        }

        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
            return String.valueOf(board[0][0]);
        }

        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != '-') {
            return String.valueOf(board[0][2]);
        }
		return null;
        }

        boolean boardIsFull(char[][]board) {
        	for(int i=0;i<3;i++) {
        		for(int j=0;i<3;j++) {
        			if(board[i][j] == '-') {
        				return false;
        			}
        		}
        	}
        	return true;
        	
        }
}
