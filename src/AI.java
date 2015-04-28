import java.util.Random;

public class AI {
	private Game game;
	// Add a board and create set method to set this board to Game board
	private char[][] board;

	public AI(Game game) {
		this.game = game;
	}

	private Location checkRows(int i) {
		if (board[i][0] != ' ' && board[i][0] == board[i][1]
				&& board[i][1] == board[i][2] && game.isFree(i, 3)) {
			return new Location(i, 3);
		} else if (board[i][0] != ' ' && board[i][0] == board[i][1]
				&& board[i][1] == board[i][3] && game.isFree(i, 2)) {
			return new Location(i, 2);
		} else if (board[i][0] != ' ' && board[i][0] == board[i][2]
				&& board[i][2] == board[i][3] && game.isFree(i, 1)) {
			return new Location(i, 1);
		} else if (board[i][1] != ' ' && board[i][1] == board[i][2]
				&& board[i][2] == board[i][3] && game.isFree(i, 0)) {
			return new Location(i, 0);
		} else
			return null;
	}

	private Location checkColumns(int i) {
		if (board[0][i] != ' ' && board[0][i] == board[1][i]
				&& board[1][i] == board[2][i] && game.isFree(3, i)) {
			return new Location(3, i);
		} else if (board[0][i] != ' ' && board[0][i] == board[2][i]
				&& board[2][i] == board[3][i] && game.isFree(1, i)) {
			return new Location(1, i);
		} else if (board[0][i] != ' ' && board[0][i] == board[1][i]
				&& board[1][i] == board[3][i] && game.isFree(2, i)) {
			return new Location(2, i);
		} else if (board[1][i] != ' ' && board[1][i] == board[2][i]
				&& board[2][i] == board[3][i] && game.isFree(0, i)) {
			return new Location(0, i);
		} else
			return null;
	}

	private Location checkPositiveSlopeDiagonal() {
		if (board[0][0] == board[1][1] && board[1][1] == board[2][2]
				&& game.isFree(3, 3)) {
			return new Location(3, 3);
		} else if (board[1][1] == board[2][2] && board[2][2] == board[3][3]
				&& game.isFree(0, 0)) {
			return new Location(3, 3);
		} else if (board[0][0] == board[2][2] && board[2][2] == board[3][3]
				&& game.isFree(1, 1)) {
			return new Location(1, 1);
		} else if (board[0][0] == board[1][1] && board[1][1] == board[3][3]
				&& game.isFree(2, 2)) {
			return new Location(2, 2);
		} else
			return null;
	}

	private Location checkNegativeSlopeDiagonal() {
		if (board[3][0] == board[2][1] && board[2][1] == board[1][2]
				&& game.isFree(0, 3)) {
			return new Location(0, 3);
		} else if (board[0][3] == board[2][1] && board[2][1] == board[1][2]
				&& game.isFree(3, 0)) {
			return new Location(3, 0);
		} else if (board[3][0] == board[1][2] && board[1][2] == board[0][3]
				&& game.isFree(2, 1)) {
			return new Location(2, 1);
		} else if (board[3][0] == board[2][1] && board[2][1] == board[0][3]
				&& game.isFree(1, 2)) {
			return new Location(1, 2);
		} else
			return null;
	}

	private Location checkDiagonals() {
		Location diagonalBlock;
		diagonalBlock = checkPositiveSlopeDiagonal();
		if (diagonalBlock != null) {
			return diagonalBlock;
		}
		diagonalBlock = checkNegativeSlopeDiagonal();
		if (diagonalBlock != null) {
			return diagonalBlock;
		} else
			return null;

	}

	public Location blockPlayer(Game game) {
		this.board = game.getBoard();
		Location computerMove;
		for (int i = 0; i < board.length; i++) {
			computerMove = checkRows(i);
			if (computerMove != null) {
				return computerMove;
			}
			computerMove = checkColumns(i);
			if (computerMove != null) {
				return computerMove;
			}
		}

		computerMove = checkDiagonals();
		if (computerMove != null) {
			return computerMove;
		}
		int row, col;
		do {

			Random random = new Random();
			row = random.nextInt(4);
			col = random.nextInt(4);
		} while (!game.isFree(row, col));
		return new Location(row, col);
	}

}
